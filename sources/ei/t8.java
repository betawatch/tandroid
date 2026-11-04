package ei;

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
import b8.mf;
import b8.pf;
import gi.sb;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ex;
import org.telegram.ui.fx;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class t8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.u5 E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public r8 a;
    public r8 b;
    public gi.l3 c;
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

    public t8(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.E = new org.telegram.ui.Components.u5(view, 0L, 360L, xq.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(gi.f7 f7Var) {
        if (f7Var == null || f7Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < f7Var.T0.size(); i3++) {
            if (((z10) f7Var.T0.get(i3)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((z10) f7Var.T0.get(i3)).M);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, fx fxVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        gi.l3 l3Var = this.c;
        if (l3Var != null) {
            l3Var.f(true);
            this.c = null;
        }
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != frameLayout) {
                removeView(childAt);
                i3--;
            }
            i3++;
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
                    w8 w8Var = new w8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, fxVar);
                    if (storyItem != null) {
                        w8Var.c(storyItem.views, false);
                    }
                    pf.a(w8Var);
                    view = w8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    sb sbVar = new sb();
                    sbVar.c = tL_mediaAreaWeather.emoji;
                    sbVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    ug.l0 l0Var = new ug.l0(getContext(), org.telegram.messenger.g0.p);
                    l0Var.setMaxWidth(org.telegram.messenger.g0.q.x);
                    l0Var.setIsVideo(true);
                    l0Var.d(h10.t0, sbVar.c);
                    l0Var.setText(sbVar.a());
                    l0Var.e(3, tL_mediaAreaWeather.color);
                    view = new s8(getContext(), l0Var, mediaArea);
                } else {
                    view = new r8(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, fx fxVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, fxVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            r8 r8Var = this.b;
            float d = this.y.d((r8Var == null || !r8Var.s || r8Var.x) ? false : true);
            r8 r8Var2 = this.b;
            boolean z10 = r8Var2 != null && r8Var2.x;
            float d10 = this.E.d(z10);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), hs.e4, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d, 402653184));
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.u5 u5Var = ((r8) childAt).a;
                        r8 r8Var3 = this.b;
                        float d11 = u5Var.d(childAt == r8Var3 && r8Var3.s);
                        if (d11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i10 = (int) (d11 * 255.0f);
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
            if ((z10 || d10 > 0.0f) && this.a != null) {
                if (this.G == null) {
                    this.G = ((i3) this).J.getPlayingBitmap();
                }
                if (this.G != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d10, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    r8 r8Var4 = this.a;
                    float T1 = org.telegram.messenger.g0.T1(1.0f, (r8Var4.y ? r8Var4.r.a(0.05f) : 1.0f) * 1.05f, d10);
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
        } else if (view instanceof r8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((r8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.H) {
            return;
        }
        this.H = true;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof r8) {
                r8 r8Var = (r8) childAt;
                z5 z5Var = r8Var.I;
                if (r8Var.w) {
                    org.telegram.messenger.g0.r(z5Var);
                    org.telegram.messenger.g0.i3(z5Var, 400L);
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
        r8 r8Var;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        boolean z12;
        if (view instanceof r8) {
            float f14 = 2.0f;
            if (view instanceof w8) {
                w8 w8Var = (w8) view;
                TL_stories.MediaArea mediaArea = w8Var.b;
                j4 j4Var = ((i3) this).J;
                boolean z13 = j4Var.m1;
                h4 h4Var = j4Var.y1;
                if (!z13 && h4Var.a != null) {
                    dh.n0 d = dh.n0.d(mediaArea.reaction);
                    if (!d.equals(dh.n0.d(h4Var.a.sent_reaction))) {
                        j4Var.J0(d);
                    }
                }
                w8Var.performHapticFeedback(3);
                w8Var.L.a.P0(false);
                fx fxVar = j4Var.U0;
                Random random = fxVar.h;
                FrameLayout frameLayout = fxVar.H;
                ArrayList arrayList2 = fxVar.G;
                if (arrayList2.size() > 12) {
                    return;
                }
                dh.n0 d10 = dh.n0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = zi.U(org.telegram.ui.Components.g5.e(fxVar.b, d10.g));
                }
                float measuredHeight = w8Var.getMeasuredHeight();
                float measuredWidth = w8Var.getMeasuredWidth();
                View view2 = (View) w8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f11 = 0.4f * view2.getWidth();
                    f10 = f11;
                } else {
                    f10 = measuredHeight;
                    f11 = measuredWidth;
                }
                String p10 = fx.p(str);
                int hashCode = w8Var.hashCode();
                boolean z14 = w8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                    if (fxVar.d(p10, hashCode, null, null, -1, false, false, f11, f10, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ex exVar = (ex) k2.p1.h(1, arrayList);
                        exVar.getClass();
                        exVar.e = f13;
                        exVar.d = f12;
                        exVar.a = w8Var.getTranslationX() - (exVar.d / 2.0f);
                        float translationY = w8Var.getTranslationY();
                        float f15 = exVar.d;
                        exVar.b = translationY - (1.5f * f15);
                        if (exVar.m) {
                            exVar.a = ((-f15) * 1.8f) + exVar.a;
                            return;
                        } else {
                            exVar.a = ((-f15) * 0.2f) + exVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                }
                if (d10.g == 0 || w8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i3 = 0;
                int i10 = 0;
                while (i3 < arrayList.size()) {
                    float f16 = f14;
                    Random random2 = random;
                    if (((ex) arrayList.get(i3)).k == d10.g) {
                        i10++;
                    }
                    i3++;
                    random = random2;
                    f14 = f16;
                }
                Random random3 = random;
                float f17 = f14;
                if (i10 >= 4) {
                    return;
                }
                ex exVar2 = new ex();
                exVar2.j = dh.d.a(w8Var.getAnimatedEmojiDrawable(), true, true);
                if (!exVar2.i) {
                    exVar2.f = ((random3.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    exVar2.g = ((random3.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                exVar2.p = hashCode;
                exVar2.q = null;
                exVar2.k = d10.g;
                exVar2.m = z12;
                exVar2.e = f13;
                exVar2.d = f12;
                exVar2.a = w8Var.getTranslationX() - (exVar2.d / f17);
                float translationY2 = w8Var.getTranslationY();
                float f18 = exVar2.d;
                exVar2.b = translationY2 - (1.5f * f18);
                exVar2.a = ((-f18) * 1.8f) + exVar2.a;
                if (fxVar.n) {
                    exVar2.j.f(frameLayout);
                }
                arrayList.add(exVar2);
                return;
            }
            if (this.b == view) {
                org.telegram.messenger.g0.i3(new z5(this, 8), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((i3) this).I.V(new wm(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    sf.c.t(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    sf.c.t(getContext(), "https://" + hp.s1(h10.t0).V2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                p8 p8Var = new p8(r4, 0);
                p8Var.w = true;
                p8Var.O0 = this.b.b;
                p8Var.setResourceProvider(this.n);
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
                    p8Var.P0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                p8Var.Q0 = false;
                p8Var.G0(new zi(h10.t0, tL_message, false, false));
                ((i3) this).I.V(p8Var);
                this.b = null;
                invalidate();
                return;
            }
            r8 r8Var2 = (r8) view;
            this.a = r8Var2;
            this.b = r8Var2;
            invalidate();
            gi.l3 l3Var = this.c;
            if (l3Var != null) {
                l3Var.f(true);
                this.c = null;
            }
            gi.l3 l3Var2 = new gi.l3(getContext(), 0);
            Paint paint = new Paint(1);
            l3Var2.c0 = paint;
            paint.setPathEffect(new CornerPathEffect(l3Var2.w));
            org.telegram.ui.Cells.y yVar = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new gi.k3(l3Var2, 0));
            l3Var2.b0 = yVar;
            yVar.setCallback(l3Var2);
            l3Var2.p(0.0f, this.b.getTranslationX() - org.telegram.messenger.g0.L(8.0f));
            l3Var2.d = 5000L;
            this.c = l3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) bd.M0(2131744457, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) bd.M0(2131744459, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    l3Var2.r(true);
                    spannableStringBuilder.append((CharSequence) bd.M0(2131744603, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), org.telegram.messenger.g0.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.r1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new q8(0), length, spannableStringBuilder.length(), 33);
                    l3Var2.n(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    wp wpVar = new wp(R.drawable.photos_arrow, 0);
                    float L = org.telegram.messenger.g0.L(!z10 ? 1.0f : 2.0f);
                    float L2 = org.telegram.messenger.g0.L(!z10 ? 0.0f : 1.0f);
                    wpVar.r = L;
                    wpVar.s = L2;
                    spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    wp wpVar2 = new wp(R.drawable.attach_arrow_right, 0);
                    float L3 = org.telegram.messenger.g0.L(!z10 ? -1.0f : -2.0f);
                    float L4 = org.telegram.messenger.g0.L(z10 ? 0.0f : 1.0f);
                    wpVar2.r = L3;
                    wpVar2.s = L4;
                    wpVar2.I = -1.0f;
                    wpVar2.J = 1.0f;
                    spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                    if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">");
                    l3Var2.u(spannableStringBuilder);
                    l3Var2.r0 = new b0(27, this, l3Var2);
                    float f19 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f19)) >= ((float) org.telegram.messenger.g0.L(100.0f));
                    l3Var2.a = z11 ? 1 : 3;
                    r8Var = this.b;
                    if (!(r8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (r8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19) >= org.telegram.messenger.g0.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + r8Var.getTranslationY() <= getMeasuredHeight() - org.telegram.messenger.g0.L(120.0f))) {
                        l3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        l3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19));
                    } else {
                        l3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    l3Var2.setOnClickListener(new ai.b(this, 20));
                    l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    this.d.addView(l3Var2, mf.c(f19, -1));
                    l3Var2.w();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) bd.M0(2131744458, null));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            wp wpVar3 = new wp(R.drawable.photos_arrow, 0);
            float L5 = org.telegram.messenger.g0.L(!z10 ? 1.0f : 2.0f);
            float L22 = org.telegram.messenger.g0.L(!z10 ? 0.0f : 1.0f);
            wpVar3.r = L5;
            wpVar3.s = L22;
            spannableString3.setSpan(wpVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            wp wpVar22 = new wp(R.drawable.attach_arrow_right, 0);
            float L32 = org.telegram.messenger.g0.L(!z10 ? -1.0f : -2.0f);
            float L42 = org.telegram.messenger.g0.L(z10 ? 0.0f : 1.0f);
            wpVar22.r = L32;
            wpVar22.s = L42;
            wpVar22.I = -1.0f;
            wpVar22.J = 1.0f;
            spannableString22.setSpan(wpVar22, 0, spannableString22.length(), 33);
            if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
            }
            org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString3, ">");
            l3Var2.u(spannableStringBuilder);
            l3Var2.r0 = new b0(27, this, l3Var2);
            float f192 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f192)) >= ((float) org.telegram.messenger.g0.L(100.0f))) {
            }
            l3Var2.a = z11 ? 1 : 3;
            r8Var = this.b;
            if (!(r8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            l3Var2.setOnClickListener(new ai.b(this, 20));
            l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            this.d.addView(l3Var2, mf.c(f192, -1));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i3, i12 - i10);
            } else if (childAt instanceof r8) {
                r8 r8Var = (r8) childAt;
                TL_stories.MediaArea mediaArea = r8Var.b;
                int measuredWidth = r8Var.getMeasuredWidth();
                int measuredHeight = r8Var.getMeasuredHeight();
                r8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                r8Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                r8Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                r8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) childAt;
                TL_stories.MediaArea mediaArea2 = s8Var.a;
                int measuredWidth2 = s8Var.getMeasuredWidth();
                int measuredHeight2 = s8Var.getMeasuredHeight();
                s8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                s8Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                s8Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                s8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof r8) {
                r8 r8Var = (r8) getChildAt(i11);
                r8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r8Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r8Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) getChildAt(i11);
                s8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gi.l3 l3Var;
        if (getChildCount() == 0 || (l3Var = this.c) == null || !l3Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            gi.l3 l3Var2 = this.c;
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
