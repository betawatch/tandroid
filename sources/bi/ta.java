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
import di.nd;
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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.co;
import org.telegram.ui.fz;
import org.telegram.ui.gz;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class ta extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public ra a;
    public ra b;
    public di.f4 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.e6 x;
    public final org.telegram.ui.Components.e6 y;

    public ta(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.n = f6Var;
        this.x = new org.telegram.ui.Components.e6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.e6(view, 0L, 360L, pr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(di.o8 o8Var) {
        if (o8Var == null || o8Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < o8Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) o8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) o8Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, gz gzVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        di.f4 f4Var = this.c;
        if (f4Var != null) {
            f4Var.e(true);
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
                    wa waVar = new wa(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, gzVar);
                    if (storyItem != null) {
                        waVar.c(storyItem.views, false);
                    }
                    w7.z5.a(waVar);
                    view = waVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    nd ndVar = new nd();
                    ndVar.c = tL_mediaAreaWeather.emoji;
                    ndVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    rg.u0 u0Var = new rg.u0(getContext(), AndroidUtilities.density);
                    u0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    u0Var.setIsVideo(true);
                    u0Var.d(UserConfig.selectedAccount, ndVar.c);
                    u0Var.setText(ndVar.a());
                    u0Var.e(3, tL_mediaAreaWeather.color);
                    view = new sa(getContext(), u0Var, mediaArea);
                } else {
                    view = new ra(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, gz gzVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, gzVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        float f7;
        float f10;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            ra raVar = this.b;
            float e7 = this.x.e((raVar == null || !raVar.s || raVar.w) ? false : true);
            ra raVar2 = this.b;
            boolean z10 = raVar2 != null && raVar2.w;
            float e10 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e7 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e7, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.e6 e6Var = ((ra) childAt).a;
                        ra raVar3 = this.b;
                        float e11 = e6Var.e(childAt == raVar3 && raVar3.s);
                        if (e11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e11 * 255.0f);
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
                f7 = 0.0f;
                f10 = 0.2f;
            }
            if ((z10 || e10 > f7) && this.a != null) {
                if (this.F == null) {
                    this.F = ((h4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    ra raVar4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (raVar4.x ? raVar4.r.a(0.05f) : 1.0f) * 1.05f, e10);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f10;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f7, f7, getWidth(), getHeight());
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
        } else if (view instanceof ra) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((ra) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (this.G) {
            return;
        }
        this.G = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ra) {
                ra raVar = (ra) childAt;
                oa oaVar = raVar.H;
                if (raVar.v) {
                    AndroidUtilities.cancelRunOnUIThread(oaVar);
                    AndroidUtilities.runOnUIThread(oaVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0409  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        ra raVar;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof ra) {
            if (view instanceof wa) {
                wa waVar = (wa) view;
                TL_stories.MediaArea mediaArea = waVar.b;
                o5 o5Var = ((h4) this).I;
                boolean z13 = o5Var.C1;
                m5 m5Var = o5Var.O1;
                if (!z13 && m5Var.a != null) {
                    ah.j1 d = ah.j1.d(mediaArea.reaction);
                    if (!d.equals(ah.j1.d(m5Var.a.sent_reaction))) {
                        o5Var.L0(d);
                    }
                }
                waVar.performHapticFeedback(3);
                waVar.K.a.startAnimation();
                gz gzVar = o5Var.k1;
                Random random = gzVar.h;
                FrameLayout frameLayout = gzVar.G;
                ArrayList arrayList2 = gzVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                ah.j1 d10 = ah.j1.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.q5.f(gzVar.b, d10.g));
                }
                float measuredHeight = waVar.getMeasuredHeight();
                float measuredWidth = waVar.getMeasuredWidth();
                View view2 = (View) waVar.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String q6 = gz.q(str);
                int hashCode = waVar.hashCode();
                boolean z14 = waVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (gzVar.d(q6, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        fz fzVar = (fz) i2.g.h(1, arrayList);
                        fzVar.getClass();
                        fzVar.e = f12;
                        fzVar.d = f11;
                        fzVar.a = waVar.getTranslationX() - (fzVar.d / 2.0f);
                        float translationY = waVar.getTranslationY();
                        float f13 = fzVar.d;
                        fzVar.b = translationY - (1.5f * f13);
                        if (fzVar.m) {
                            fzVar.a = ((-f13) * 1.8f) + fzVar.a;
                            return;
                        } else {
                            fzVar.a = ((-f13) * 0.2f) + fzVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || waVar.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    int i12 = i10;
                    if (((fz) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10 = i12 + 1;
                }
                if (i11 >= 4) {
                    return;
                }
                fz fzVar2 = new fz();
                fzVar2.j = ah.e.a(waVar.getAnimatedEmojiDrawable(), true, true);
                if (!fzVar2.i) {
                    fzVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    fzVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                fzVar2.p = hashCode;
                fzVar2.q = null;
                fzVar2.k = d10.g;
                fzVar2.m = z12;
                fzVar2.e = f12;
                fzVar2.d = f11;
                fzVar2.a = waVar.getTranslationX() - (fzVar2.d / 2.0f);
                float translationY2 = waVar.getTranslationY();
                float f14 = fzVar2.d;
                fzVar2.b = translationY2 - (1.5f * f14);
                fzVar2.a = ((-f14) * 1.8f) + fzVar2.a;
                if (gzVar.n) {
                    fzVar2.j.f(frameLayout);
                }
                arrayList.add(fzVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new oa(this, 0), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((h4) this).H.H(new co(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    of.f.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    of.f.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                pa paVar = new pa(3, 0);
                paVar.E = true;
                paVar.M0 = this.b.b;
                paVar.setResourceProvider(this.n);
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
                    paVar.N0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                paVar.O0 = false;
                paVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((h4) this).H.H(paVar);
                this.b = null;
                invalidate();
                return;
            }
            ra raVar2 = (ra) view;
            this.a = raVar2;
            this.b = raVar2;
            invalidate();
            di.f4 f4Var = this.c;
            if (f4Var != null) {
                f4Var.e(true);
                this.c = null;
            }
            di.f4 f4Var2 = new di.f4(getContext(), 0);
            Paint paint = new Paint(1);
            f4Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(f4Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new di.e4(f4Var2, 0));
            f4Var2.a0 = zVar;
            zVar.setCallback(f4Var2);
            f4Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            f4Var2.d = 5000L;
            this.c = f4Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    f4Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new qa(0), length, spannableStringBuilder.length(), 33);
                    f4Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    nq nqVar = new nq(R.drawable.photos_arrow, 0);
                    nqVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    nq nqVar2 = new nq(R.drawable.attach_arrow_right, 0);
                    nqVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
                    nqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    f4Var2.s(spannableStringBuilder);
                    f4Var2.l0 = new s8(11, this, f4Var2);
                    float f15 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f15)) < ((float) AndroidUtilities.dp(100.0f));
                    f4Var2.a = !z11 ? 1 : 3;
                    raVar = this.b;
                    if (!(raVar.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (raVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + raVar.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        f4Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        f4Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15));
                    } else {
                        f4Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    f4Var2.setOnClickListener(new ah.h0(this, 5));
                    f4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(f4Var2, w7.x5.c(f15, -1));
                    f4Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            nq nqVar3 = new nq(R.drawable.photos_arrow, 0);
            nqVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(nqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            nq nqVar22 = new nq(R.drawable.attach_arrow_right, 0);
            nqVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
            nqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(nqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            f4Var2.s(spannableStringBuilder);
            f4Var2.l0 = new s8(11, this, f4Var2);
            float f152 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f152)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            f4Var2.a = !z11 ? 1 : 3;
            raVar = this.b;
            if (!(raVar.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            f4Var2.setOnClickListener(new ah.h0(this, 5));
            f4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(f4Var2, w7.x5.c(f152, -1));
            f4Var2.u();
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
            } else if (childAt instanceof ra) {
                ra raVar = (ra) childAt;
                TL_stories.MediaArea mediaArea = raVar.b;
                int measuredWidth = raVar.getMeasuredWidth();
                int measuredHeight = raVar.getMeasuredHeight();
                raVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                raVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                raVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                raVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof sa) {
                sa saVar = (sa) childAt;
                TL_stories.MediaArea mediaArea2 = saVar.a;
                int measuredWidth2 = saVar.getMeasuredWidth();
                int measuredHeight2 = saVar.getMeasuredHeight();
                saVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                saVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                saVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                saVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof ra) {
                ra raVar = (ra) getChildAt(i12);
                raVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((raVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((raVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof sa) {
                sa saVar = (sa) getChildAt(i12);
                saVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((saVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((saVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        di.f4 f4Var;
        if (getChildCount() == 0 || (f4Var = this.c) == null || !f4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            di.f4 f4Var2 = this.c;
            if (f4Var2 != null) {
                f4Var2.e(true);
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
