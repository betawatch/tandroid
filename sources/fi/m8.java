package fi;

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
import c8.ja;
import c8.na;
import hi.pb;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.an;
import org.telegram.ui.ix;
import org.telegram.ui.jx;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.u5 E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public k8 a;
    public k8 b;
    public hi.l3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.e6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final org.telegram.ui.Components.u5 y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.w = new RectF();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.F = new Path();
        this.H = false;
        this.h = view;
        this.n = e6Var;
        this.y = new org.telegram.ui.Components.u5(view, 0L, 120L, new LinearInterpolator());
        this.E = new org.telegram.ui.Components.u5(view, 0L, 360L, er.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var == null || d7Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < d7Var.T0.size(); i7++) {
            if (((e20) d7Var.T0.get(i7)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((e20) d7Var.T0.get(i7)).M);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, jx jxVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        hi.l3 l3Var = this.c;
        if (l3Var != null) {
            l3Var.f(true);
            this.c = null;
        }
        int i7 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt != frameLayout) {
                removeView(childAt);
                i7--;
            }
            i7++;
        }
        this.b = null;
        this.E.e(true, 0.0f);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.H = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    p8 p8Var = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, jxVar);
                    if (storyItem != null) {
                        p8Var.c(storyItem.views, false);
                    }
                    na.a(p8Var);
                    view = p8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    pb pbVar = new pb();
                    pbVar.c = tL_mediaAreaWeather.emoji;
                    pbVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    tg.m0 m0Var = new tg.m0(getContext(), org.telegram.messenger.g0.p);
                    m0Var.setMaxWidth(org.telegram.messenger.g0.q.x);
                    m0Var.setIsVideo(true);
                    m0Var.d(m10.t0, pbVar.c);
                    m0Var.setText(pbVar.a());
                    m0Var.e(3, tL_mediaAreaWeather.color);
                    view = new l8(getContext(), m0Var, mediaArea);
                } else {
                    view = new k8(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, jx jxVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, jxVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var = this.b;
            float d = this.y.d((k8Var == null || !k8Var.s || k8Var.x) ? false : true);
            k8 k8Var2 = this.b;
            boolean z10 = k8Var2 != null && k8Var2.x;
            float d2 = this.E.d(z10);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ns.e4, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d, 402653184));
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.u5 u5Var = ((k8) childAt).a;
                        k8 k8Var3 = this.b;
                        float d10 = u5Var.d(childAt == k8Var3 && k8Var3.s);
                        if (d10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i10 = (int) (d10 * 255.0f);
                            Paint paint = this.x;
                            paint.setAlpha(i10);
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
            if ((z10 || d2 > 0.0f) && this.a != null) {
                if (this.G == null) {
                    this.G = ((a3) this).J.getPlayingBitmap();
                }
                if (this.G != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    k8 k8Var4 = this.a;
                    float T1 = org.telegram.messenger.g0.T1(1.0f, (k8Var4.y ? k8Var4.r.a(0.05f) : 1.0f) * 1.05f, d2);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * 0.2f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * T1, this.a.getScaleY() * T1, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.G = null;
                }
            }
            invalidate();
        } else if (view instanceof k8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((k8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (this.H) {
            return;
        }
        this.H = true;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                c1 c1Var = k8Var.I;
                if (k8Var.w) {
                    org.telegram.messenger.g0.r(c1Var);
                    org.telegram.messenger.g0.i3(c1Var, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        k8 k8Var;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        boolean z12;
        if (view instanceof k8) {
            float f14 = 2.0f;
            if (view instanceof p8) {
                p8 p8Var = (p8) view;
                TL_stories.MediaArea mediaArea = p8Var.b;
                b4 b4Var = ((a3) this).J;
                boolean z13 = b4Var.m1;
                z3 z3Var = b4Var.y1;
                if (!z13 && z3Var.a != null) {
                    ch.p0 d = ch.p0.d(mediaArea.reaction);
                    if (!d.equals(ch.p0.d(z3Var.a.sent_reaction))) {
                        b4Var.J0(d);
                    }
                }
                p8Var.performHapticFeedback(3);
                p8Var.L.a.P0(false);
                jx jxVar = b4Var.U0;
                Random random = jxVar.h;
                FrameLayout frameLayout = jxVar.H;
                ArrayList arrayList2 = jxVar.G;
                if (arrayList2.size() > 12) {
                    return;
                }
                ch.p0 d2 = ch.p0.d(mediaArea.reaction);
                String str = d2.f;
                if (str == null) {
                    str = gj.U(org.telegram.ui.Components.g5.e(jxVar.b, d2.g));
                }
                float measuredHeight = p8Var.getMeasuredHeight();
                float measuredWidth = p8Var.getMeasuredWidth();
                View view2 = (View) p8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f11 = 0.4f * view2.getWidth();
                    f10 = f11;
                } else {
                    f10 = measuredHeight;
                    f11 = measuredWidth;
                }
                String p10 = jx.p(str);
                int hashCode = p8Var.hashCode();
                boolean z14 = p8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d2.f != null) {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                    if (jxVar.d(p10, hashCode, null, null, -1, false, false, f11, f10, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ix ixVar = (ix) i5.c.h(1, arrayList);
                        ixVar.getClass();
                        ixVar.e = f13;
                        ixVar.d = f12;
                        ixVar.a = p8Var.getTranslationX() - (ixVar.d / 2.0f);
                        float translationY = p8Var.getTranslationY();
                        float f15 = ixVar.d;
                        ixVar.b = translationY - (1.5f * f15);
                        if (ixVar.m) {
                            ixVar.a = ((-f15) * 1.8f) + ixVar.a;
                            return;
                        } else {
                            ixVar.a = ((-f15) * 0.2f) + ixVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                }
                if (d2.g == 0 || p8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i7 = 0;
                int i10 = 0;
                while (i7 < arrayList.size()) {
                    float f16 = f14;
                    Random random2 = random;
                    if (((ix) arrayList.get(i7)).k == d2.g) {
                        i10++;
                    }
                    i7++;
                    random = random2;
                    f14 = f16;
                }
                Random random3 = random;
                float f17 = f14;
                if (i10 >= 4) {
                    return;
                }
                ix ixVar2 = new ix();
                ixVar2.j = ch.d.a(p8Var.getAnimatedEmojiDrawable(), true, true);
                if (!ixVar2.i) {
                    ixVar2.f = ((random3.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    ixVar2.g = ((random3.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                ixVar2.p = hashCode;
                ixVar2.q = null;
                ixVar2.k = d2.g;
                ixVar2.m = z12;
                ixVar2.e = f13;
                ixVar2.d = f12;
                ixVar2.a = p8Var.getTranslationX() - (ixVar2.d / f17);
                float translationY2 = p8Var.getTranslationY();
                float f18 = ixVar2.d;
                ixVar2.b = translationY2 - (1.5f * f18);
                ixVar2.a = ((-f18) * 1.8f) + ixVar2.a;
                if (jxVar.n) {
                    ixVar2.j.f(frameLayout);
                }
                arrayList.add(ixVar2);
                return;
            }
            if (this.b == view) {
                org.telegram.messenger.g0.i3(new c1(this, 16), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((a3) this).I.N(new an(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    vf.c.t(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    vf.c.t(getContext(), "https://" + np.s1(m10.t0).V2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                i8 i8Var = new i8(r4, 0);
                i8Var.w = true;
                i8Var.O0 = this.b.b;
                i8Var.setResourceProvider(this.n);
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
                    i8Var.P0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                i8Var.Q0 = false;
                i8Var.G0(new gj(m10.t0, tL_message, false, false));
                ((a3) this).I.N(i8Var);
                this.b = null;
                invalidate();
                return;
            }
            k8 k8Var2 = (k8) view;
            this.a = k8Var2;
            this.b = k8Var2;
            invalidate();
            hi.l3 l3Var = this.c;
            if (l3Var != null) {
                l3Var.f(true);
                this.c = null;
            }
            hi.l3 l3Var2 = new hi.l3(getContext(), 0);
            Paint paint = new Paint(1);
            l3Var2.c0 = paint;
            paint.setPathEffect(new CornerPathEffect(l3Var2.w));
            org.telegram.ui.Cells.y yVar = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new hi.k3(l3Var2, 0));
            l3Var2.b0 = yVar;
            yVar.setCallback(l3Var2);
            l3Var2.p(0.0f, this.b.getTranslationX() - org.telegram.messenger.g0.L(8.0f));
            l3Var2.d = 5000L;
            this.c = l3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131744447, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131744449, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    l3Var2.r(true);
                    spannableStringBuilder.append((CharSequence) hd.M0(2131744593, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), org.telegram.messenger.g0.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.r1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new j8(0), length, spannableStringBuilder.length(), 33);
                    l3Var2.n(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    eq eqVar = new eq(R.drawable.photos_arrow, 0);
                    float L = org.telegram.messenger.g0.L(!z10 ? 1.0f : 2.0f);
                    float L2 = org.telegram.messenger.g0.L(!z10 ? 0.0f : 1.0f);
                    eqVar.r = L;
                    eqVar.s = L2;
                    spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    eq eqVar2 = new eq(R.drawable.attach_arrow_right, 0);
                    float L3 = org.telegram.messenger.g0.L(!z10 ? -1.0f : -2.0f);
                    float L4 = org.telegram.messenger.g0.L(z10 ? 0.0f : 1.0f);
                    eqVar2.r = L3;
                    eqVar2.s = L4;
                    eqVar2.I = -1.0f;
                    eqVar2.J = 1.0f;
                    spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                    if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">");
                    l3Var2.u(spannableStringBuilder);
                    l3Var2.r0 = new f6(15, this, l3Var2);
                    float f19 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f19)) >= ((float) org.telegram.messenger.g0.L(100.0f));
                    l3Var2.a = z11 ? 1 : 3;
                    k8Var = this.b;
                    if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (k8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19) >= org.telegram.messenger.g0.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + k8Var.getTranslationY() <= getMeasuredHeight() - org.telegram.messenger.g0.L(120.0f))) {
                        l3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        l3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19));
                    } else {
                        l3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    l3Var2.setOnClickListener(new ah.d(this, 23));
                    l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    this.d.addView(l3Var2, ja.c(f19, -1));
                    l3Var2.w();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) hd.M0(2131744448, null));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            eq eqVar3 = new eq(R.drawable.photos_arrow, 0);
            float L5 = org.telegram.messenger.g0.L(!z10 ? 1.0f : 2.0f);
            float L22 = org.telegram.messenger.g0.L(!z10 ? 0.0f : 1.0f);
            eqVar3.r = L5;
            eqVar3.s = L22;
            spannableString3.setSpan(eqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            eq eqVar22 = new eq(R.drawable.attach_arrow_right, 0);
            float L32 = org.telegram.messenger.g0.L(!z10 ? -1.0f : -2.0f);
            float L42 = org.telegram.messenger.g0.L(z10 ? 0.0f : 1.0f);
            eqVar22.r = L32;
            eqVar22.s = L42;
            eqVar22.I = -1.0f;
            eqVar22.J = 1.0f;
            spannableString22.setSpan(eqVar22, 0, spannableString22.length(), 33);
            if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
            }
            org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString3, ">");
            l3Var2.u(spannableStringBuilder);
            l3Var2.r0 = new f6(15, this, l3Var2);
            float f192 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f192)) >= ((float) org.telegram.messenger.g0.L(100.0f))) {
            }
            l3Var2.a = z11 ? 1 : 3;
            k8Var = this.b;
            if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            l3Var2.setOnClickListener(new ah.d(this, 23));
            l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            this.d.addView(l3Var2, ja.c(f192, -1));
            l3Var2.w();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i7, i12 - i10);
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                TL_stories.MediaArea mediaArea = k8Var.b;
                int measuredWidth = k8Var.getMeasuredWidth();
                int measuredHeight = k8Var.getMeasuredHeight();
                k8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                k8Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                k8Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                k8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) childAt;
                TL_stories.MediaArea mediaArea2 = l8Var.a;
                int measuredWidth2 = l8Var.getMeasuredWidth();
                int measuredHeight2 = l8Var.getMeasuredHeight();
                l8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                l8Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                l8Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                l8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) getChildAt(i11);
                k8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) getChildAt(i11);
                l8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        hi.l3 l3Var;
        if (getChildCount() == 0 || (l3Var = this.c) == null || !l3Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            hi.l3 l3Var2 = this.c;
            if (l3Var2 != null) {
                l3Var2.f(true);
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
