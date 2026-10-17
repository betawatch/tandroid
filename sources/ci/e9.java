package ci;

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
import ei.tc;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yq;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public abstract class e9 extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public c9 a;
    public c9 b;
    public ei.x3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.d6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.f6 x;
    public final org.telegram.ui.Components.f6 y;

    public e9(Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.n = d6Var;
        this.x = new org.telegram.ui.Components.f6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.f6(view, 0L, 360L, bs.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ei.a8 a8Var) {
        if (a8Var == null || a8Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < a8Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) a8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) a8Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, qy qyVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        ei.x3 x3Var = this.c;
        if (x3Var != null) {
            x3Var.e(true);
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
                    h9 h9Var = new h9(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, qyVar);
                    if (storyItem != null) {
                        h9Var.c(storyItem.views, false);
                    }
                    w7.b6.a(h9Var);
                    view = h9Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    tc tcVar = new tc();
                    tcVar.c = tL_mediaAreaWeather.emoji;
                    tcVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    rg.s0 s0Var = new rg.s0(getContext(), AndroidUtilities.density);
                    s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    s0Var.setIsVideo(true);
                    s0Var.d(UserConfig.selectedAccount, tcVar.c);
                    s0Var.setText(tcVar.a());
                    s0Var.e(3, tL_mediaAreaWeather.color);
                    view = new d9(getContext(), s0Var, mediaArea);
                } else {
                    view = new c9(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, qy qyVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, qyVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            c9 c9Var = this.b;
            float e = this.x.e((c9Var == null || !c9Var.s || c9Var.w) ? false : true);
            c9 c9Var2 = this.b;
            boolean z10 = c9Var2 != null && c9Var2.w;
            float e7 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.f6 f6Var = ((c9) childAt).a;
                        c9 c9Var3 = this.b;
                        float e10 = f6Var.e(childAt == c9Var3 && c9Var3.s);
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
                    this.F = ((n3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    c9 c9Var4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (c9Var4.x ? c9Var4.r.a(0.05f) : 1.0f) * 1.05f, e7);
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
        } else if (view instanceof c9) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((c9) view).a(canvas);
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
            if (childAt instanceof c9) {
                c9 c9Var = (c9) childAt;
                androidx.fragment.app.d dVar = c9Var.H;
                if (c9Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0405  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        c9 c9Var;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof c9) {
            float f13 = 2.0f;
            if (view instanceof h9) {
                h9 h9Var = (h9) view;
                TL_stories.MediaArea mediaArea = h9Var.b;
                q4 q4Var = ((n3) this).I;
                boolean z13 = q4Var.C1;
                o4 o4Var = q4Var.O1;
                if (!z13 && o4Var.a != null) {
                    ah.i1 d = ah.i1.d(mediaArea.reaction);
                    if (!d.equals(ah.i1.d(o4Var.a.sent_reaction))) {
                        q4Var.L0(d);
                    }
                }
                h9Var.performHapticFeedback(3);
                h9Var.K.a.startAnimation();
                qy qyVar = q4Var.k1;
                Random random = qyVar.h;
                FrameLayout frameLayout = qyVar.G;
                ArrayList arrayList2 = qyVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                ah.i1 d10 = ah.i1.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.r5.f(qyVar.b, d10.g));
                }
                float measuredHeight = h9Var.getMeasuredHeight();
                float measuredWidth = h9Var.getMeasuredWidth();
                View view2 = (View) h9Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String p5 = qy.p(str);
                int hashCode = h9Var.hashCode();
                boolean z14 = h9Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (qyVar.d(p5, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        py pyVar = (py) i0.a.h(1, arrayList);
                        pyVar.getClass();
                        pyVar.e = f12;
                        pyVar.d = f11;
                        pyVar.a = h9Var.getTranslationX() - (pyVar.d / 2.0f);
                        float translationY = h9Var.getTranslationY();
                        float f14 = pyVar.d;
                        pyVar.b = translationY - (1.5f * f14);
                        if (pyVar.m) {
                            pyVar.a = ((-f14) * 1.8f) + pyVar.a;
                            return;
                        } else {
                            pyVar.a = ((-f14) * 0.2f) + pyVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || h9Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    float f15 = f13;
                    int i12 = i10;
                    if (((py) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10 = i12 + 1;
                    f13 = f15;
                }
                float f16 = f13;
                if (i11 >= 4) {
                    return;
                }
                py pyVar2 = new py();
                pyVar2.j = ah.e.a(h9Var.getAnimatedEmojiDrawable(), true, true);
                if (!pyVar2.i) {
                    pyVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    pyVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                pyVar2.p = hashCode;
                pyVar2.q = null;
                pyVar2.k = d10.g;
                pyVar2.m = z12;
                pyVar2.e = f12;
                pyVar2.d = f11;
                pyVar2.a = h9Var.getTranslationX() - (pyVar2.d / f16);
                float translationY2 = h9Var.getTranslationY();
                float f17 = pyVar2.d;
                pyVar2.b = translationY2 - (1.5f * f17);
                pyVar2.a = ((-f17) * 1.8f) + pyVar2.a;
                if (qyVar.n) {
                    pyVar2.j.f(frameLayout);
                }
                arrayList.add(pyVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 24), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((n3) this).H.H(new sn(bundle));
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
                a9 a9Var = new a9(3, 0);
                a9Var.E = true;
                a9Var.M0 = this.b.b;
                a9Var.setResourceProvider(this.n);
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
                    a9Var.N0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                a9Var.O0 = false;
                a9Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((n3) this).H.H(a9Var);
                this.b = null;
                invalidate();
                return;
            }
            c9 c9Var2 = (c9) view;
            this.a = c9Var2;
            this.b = c9Var2;
            invalidate();
            ei.x3 x3Var = this.c;
            if (x3Var != null) {
                x3Var.e(true);
                this.c = null;
            }
            ei.x3 x3Var2 = new ei.x3(getContext(), 0);
            Paint paint = new Paint(1);
            x3Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(x3Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new ei.w3(x3Var2, 0));
            x3Var2.a0 = zVar;
            zVar.setCallback(x3Var2);
            x3Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            x3Var2.d = 5000L;
            this.c = x3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    x3Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.m1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new b9(0), length, spannableStringBuilder.length(), 33);
                    x3Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    yq yqVar = new yq(R.drawable.photos_arrow, 0);
                    yqVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    yq yqVar2 = new yq(R.drawable.attach_arrow_right, 0);
                    yqVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
                    yqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(yqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    x3Var2.s(spannableStringBuilder);
                    x3Var2.l0 = new v7(6, this, x3Var2);
                    float f18 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f18)) < ((float) AndroidUtilities.dp(100.0f));
                    x3Var2.a = !z11 ? 1 : 3;
                    c9Var = this.b;
                    if (!(c9Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (c9Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f18) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + c9Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        x3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        x3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f18));
                    } else {
                        x3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    x3Var2.setOnClickListener(new ah.g0(this, 15));
                    x3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(x3Var2, w7.z5.d(f18, -1));
                    x3Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            yq yqVar3 = new yq(R.drawable.photos_arrow, 0);
            yqVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(yqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            yq yqVar22 = new yq(R.drawable.attach_arrow_right, 0);
            yqVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
            yqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(yqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            x3Var2.s(spannableStringBuilder);
            x3Var2.l0 = new v7(6, this, x3Var2);
            float f182 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f182)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            x3Var2.a = !z11 ? 1 : 3;
            c9Var = this.b;
            if (!(c9Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            x3Var2.setOnClickListener(new ah.g0(this, 15));
            x3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(x3Var2, w7.z5.d(f182, -1));
            x3Var2.u();
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
            } else if (childAt instanceof c9) {
                c9 c9Var = (c9) childAt;
                TL_stories.MediaArea mediaArea = c9Var.b;
                int measuredWidth = c9Var.getMeasuredWidth();
                int measuredHeight = c9Var.getMeasuredHeight();
                c9Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                c9Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                c9Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                c9Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof d9) {
                d9 d9Var = (d9) childAt;
                TL_stories.MediaArea mediaArea2 = d9Var.a;
                int measuredWidth2 = d9Var.getMeasuredWidth();
                int measuredHeight2 = d9Var.getMeasuredHeight();
                d9Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                d9Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                d9Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                d9Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof c9) {
                c9 c9Var = (c9) getChildAt(i12);
                c9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((c9Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((c9Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof d9) {
                d9 d9Var = (d9) getChildAt(i12);
                d9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((d9Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((d9Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ei.x3 x3Var;
        if (getChildCount() == 0 || (x3Var = this.c) == null || !x3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ei.x3 x3Var2 = this.c;
            if (x3Var2 != null) {
                x3Var2.e(true);
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
