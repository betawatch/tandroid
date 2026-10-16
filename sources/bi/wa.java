package bi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import di.id;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.fo;
import org.telegram.ui.jz;
import org.telegram.ui.kz;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class wa extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public ua a;
    public ua b;
    public di.d4 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.c6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.g6 x;
    public final org.telegram.ui.Components.g6 y;

    public wa(Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.n = c6Var;
        this.x = new org.telegram.ui.Components.g6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.g6(view, 0L, 360L, es.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(di.k8 k8Var) {
        if (k8Var == null || k8Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < k8Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) k8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) k8Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, kz kzVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        di.d4 d4Var = this.c;
        if (d4Var != null) {
            d4Var.e(true);
            this.c = null;
        }
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt != frameLayout) {
                removeView(childAt);
                i10--;
            }
            i10++;
        }
        this.b = null;
        this.y.d(0.0f, true);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.G = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    za zaVar = new za(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, kzVar);
                    if (storyItem != null) {
                        zaVar.c(storyItem.views, false);
                    }
                    w7.b6.a(zaVar);
                    view = zaVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    id idVar = new id();
                    idVar.c = tL_mediaAreaWeather.emoji;
                    idVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    rg.u0 u0Var = new rg.u0(getContext(), AndroidUtilities.density);
                    u0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    u0Var.setIsVideo(true);
                    u0Var.d(UserConfig.selectedAccount, idVar.c);
                    u0Var.setText(idVar.a());
                    u0Var.e(3, tL_mediaAreaWeather.color);
                    view = new va(getContext(), u0Var, mediaArea);
                } else {
                    view = new ua(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, kz kzVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, kzVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            ua uaVar = this.b;
            float e = this.x.e((uaVar == null || !uaVar.s || uaVar.w) ? false : true);
            ua uaVar2 = this.b;
            boolean z10 = uaVar2 != null && uaVar2.w;
            float e7 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.g6 g6Var = ((ua) childAt).a;
                        ua uaVar3 = this.b;
                        float e10 = g6Var.e(childAt == uaVar3 && uaVar3.s);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e10 * 255.0f);
                            Paint paint = this.w;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
            }
            if ((z10 || e7 > 0.0f) && this.a != null) {
                if (this.F == null) {
                    this.F = ((k4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    ua uaVar4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (uaVar4.x ? uaVar4.r.a(0.05f) : 1.0f) * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * 0.2f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * lerp, this.a.getScaleY() * lerp, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof ua) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((ua) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.G) {
            return;
        }
        this.G = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ua) {
                ua uaVar = (ua) childAt;
                la laVar = uaVar.H;
                if (uaVar.v) {
                    AndroidUtilities.cancelRunOnUIThread(laVar);
                    AndroidUtilities.runOnUIThread(laVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0404  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        ua uaVar;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof ua) {
            float f13 = 2.0f;
            if (view instanceof za) {
                za zaVar = (za) view;
                TL_stories.MediaArea mediaArea = zaVar.b;
                q5 q5Var = ((k4) this).I;
                boolean z13 = q5Var.C1;
                o5 o5Var = q5Var.O1;
                if (!z13 && o5Var.a != null) {
                    ah.i1 d = ah.i1.d(mediaArea.reaction);
                    if (!d.equals(ah.i1.d(o5Var.a.sent_reaction))) {
                        q5Var.L0(d);
                    }
                }
                zaVar.performHapticFeedback(3);
                zaVar.K.a.startAnimation();
                kz kzVar = q5Var.k1;
                Random random = kzVar.h;
                FrameLayout frameLayout = kzVar.G;
                ArrayList arrayList2 = kzVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                ah.i1 d10 = ah.i1.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.s5.f(kzVar.b, d10.g));
                }
                float measuredHeight = zaVar.getMeasuredHeight();
                float measuredWidth = zaVar.getMeasuredWidth();
                View view2 = (View) zaVar.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String p5 = kz.p(str);
                int hashCode = zaVar.hashCode();
                boolean z14 = zaVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (kzVar.d(p5, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        jz jzVar = (jz) i2.d.h(1, arrayList);
                        jzVar.getClass();
                        jzVar.e = f12;
                        jzVar.d = f11;
                        jzVar.a = zaVar.getTranslationX() - (jzVar.d / 2.0f);
                        float translationY = zaVar.getTranslationY();
                        float f14 = jzVar.d;
                        jzVar.b = translationY - (1.5f * f14);
                        if (jzVar.m) {
                            jzVar.a = ((-f14) * 1.8f) + jzVar.a;
                            return;
                        } else {
                            jzVar.a = ((-f14) * 0.2f) + jzVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || zaVar.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    float f15 = f13;
                    int i12 = i10;
                    if (((jz) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10 = i12 + 1;
                    f13 = f15;
                }
                float f16 = f13;
                if (i11 >= 4) {
                    return;
                }
                jz jzVar2 = new jz();
                jzVar2.j = ah.e.a(zaVar.getAnimatedEmojiDrawable(), true, true);
                if (!jzVar2.i) {
                    jzVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    jzVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                jzVar2.p = hashCode;
                jzVar2.q = null;
                jzVar2.k = d10.g;
                jzVar2.m = z12;
                jzVar2.e = f12;
                jzVar2.d = f11;
                jzVar2.a = zaVar.getTranslationX() - (jzVar2.d / f16);
                float translationY2 = zaVar.getTranslationY();
                float f17 = jzVar2.d;
                jzVar2.b = translationY2 - (1.5f * f17);
                jzVar2.a = ((-f17) * 1.8f) + jzVar2.a;
                if (kzVar.n) {
                    jzVar2.j.f(frameLayout);
                }
                arrayList.add(jzVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new la(this, 1), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((k4) this).H.H(new fo(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    pf.d.r(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    pf.d.r(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                sa saVar = new sa(3, 0);
                saVar.E = true;
                saVar.M0 = this.b.b;
                saVar.setResourceProvider(this.n);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                TL_stories.MediaArea mediaArea3 = this.b.b;
                if (mediaArea3 instanceof TL_stories.TL_mediaAreaVenue) {
                    TL_stories.TL_mediaAreaVenue tL_mediaAreaVenue = (TL_stories.TL_mediaAreaVenue) mediaArea3;
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_messageMediaVenue.venue_id = tL_mediaAreaVenue.venue_id;
                    tL_messageMediaVenue.venue_type = tL_mediaAreaVenue.venue_type;
                    tL_messageMediaVenue.title = tL_mediaAreaVenue.title;
                    tL_messageMediaVenue.address = tL_mediaAreaVenue.address;
                    tL_messageMediaVenue.provider = tL_mediaAreaVenue.provider;
                    tL_messageMediaVenue.geo = tL_mediaAreaVenue.geo;
                    tL_message.media = tL_messageMediaVenue;
                } else if (!(mediaArea3 instanceof TL_stories.TL_mediaAreaGeoPoint)) {
                    this.b = null;
                    invalidate();
                    return;
                } else {
                    saVar.N0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                saVar.O0 = false;
                saVar.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((k4) this).H.H(saVar);
                this.b = null;
                invalidate();
                return;
            }
            ua uaVar2 = (ua) view;
            this.a = uaVar2;
            this.b = uaVar2;
            invalidate();
            di.d4 d4Var = this.c;
            if (d4Var != null) {
                d4Var.e(true);
                this.c = null;
            }
            di.d4 d4Var2 = new di.d4(getContext(), 0);
            Paint paint = new Paint(1);
            d4Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(d4Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new di.c4(d4Var2, 0));
            d4Var2.a0 = zVar;
            zVar.setCallback(d4Var2);
            d4Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            d4Var2.d = 5000L;
            this.c = d4Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    d4Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.m1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ta(0), length, spannableStringBuilder.length(), 33);
                    d4Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    br brVar = new br(R.drawable.photos_arrow, 0);
                    brVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(brVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    br brVar2 = new br(R.drawable.attach_arrow_right, 0);
                    brVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
                    brVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(brVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    d4Var2.s(spannableStringBuilder);
                    d4Var2.l0 = new u8(13, this, d4Var2);
                    float f18 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f18)) < ((float) AndroidUtilities.dp(100.0f));
                    d4Var2.a = !z11 ? 1 : 3;
                    uaVar = this.b;
                    if (!(uaVar.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (uaVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f18) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + uaVar.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        d4Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        d4Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f18));
                    } else {
                        d4Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    d4Var2.setOnClickListener(new ah.g0(this, 5));
                    d4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(d4Var2, w7.z5.d(f18, -1));
                    d4Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            br brVar3 = new br(R.drawable.photos_arrow, 0);
            brVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(brVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            br brVar22 = new br(R.drawable.attach_arrow_right, 0);
            brVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
            brVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(brVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            d4Var2.s(spannableStringBuilder);
            d4Var2.l0 = new u8(13, this, d4Var2);
            float f182 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f182)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            d4Var2.a = !z11 ? 1 : 3;
            uaVar = this.b;
            if (!(uaVar.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            d4Var2.setOnClickListener(new ah.g0(this, 5));
            d4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(d4Var2, w7.z5.d(f182, -1));
            d4Var2.u();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof ua) {
                ua uaVar = (ua) childAt;
                TL_stories.MediaArea mediaArea = uaVar.b;
                int measuredWidth = uaVar.getMeasuredWidth();
                int measuredHeight = uaVar.getMeasuredHeight();
                uaVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                uaVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                uaVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                uaVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof va) {
                va vaVar = (va) childAt;
                TL_stories.MediaArea mediaArea2 = vaVar.a;
                int measuredWidth2 = vaVar.getMeasuredWidth();
                int measuredHeight2 = vaVar.getMeasuredHeight();
                vaVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                vaVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                vaVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                vaVar.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof ua) {
                ua uaVar = (ua) getChildAt(i12);
                uaVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((uaVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((uaVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof va) {
                va vaVar = (va) getChildAt(i12);
                vaVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((vaVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((vaVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        di.d4 d4Var;
        if (getChildCount() == 0 || (d4Var = this.c) == null || !d4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            di.d4 d4Var2 = this.c;
            if (d4Var2 != null) {
                d4Var2.e(true);
                this.c = null;
            }
            this.b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
