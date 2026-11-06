package di;

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
import c8.ha;
import c8.ka;
import fi.sb;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.hx;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class t8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.w5 D;
    public final Path E;
    public Bitmap F;
    public boolean G;
    public r8 a;
    public r8 b;
    public fi.m3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final org.telegram.ui.Components.w5 y;

    public t8(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.n = f6Var;
        this.y = new org.telegram.ui.Components.w5(view, 0L, 120L, new LinearInterpolator());
        this.D = new org.telegram.ui.Components.w5(view, 0L, 360L, xq.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var == null || e7Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < e7Var.T0.size(); i7++) {
            if (((h20) e7Var.T0.get(i7)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((h20) e7Var.T0.get(i7)).M);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z9);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ix ixVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        fi.m3 m3Var = this.c;
        if (m3Var != null) {
            m3Var.f(true);
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
        this.D.e(true, 0.0f);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.G = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    w8 w8Var = new w8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, ixVar);
                    if (storyItem != null) {
                        w8Var.c(storyItem.views, false);
                    }
                    ka.a(w8Var);
                    view = w8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    sb sbVar = new sb();
                    sbVar.c = tL_mediaAreaWeather.emoji;
                    sbVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    tg.m0 m0Var = new tg.m0(getContext(), org.telegram.messenger.g0.p);
                    m0Var.setMaxWidth(org.telegram.messenger.g0.q.x);
                    m0Var.setIsVideo(true);
                    m0Var.d(p10.s0, sbVar.c);
                    m0Var.setText(sbVar.a());
                    m0Var.e(3, tL_mediaAreaWeather.color);
                    view = new s8(getContext(), m0Var, mediaArea);
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

    public final void d(TL_stories.StoryItem storyItem, ix ixVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, ixVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            r8 r8Var = this.b;
            float d = this.y.d((r8Var == null || !r8Var.s || r8Var.x) ? false : true);
            r8 r8Var2 = this.b;
            boolean z9 = r8Var2 != null && r8Var2.x;
            float d2 = this.D.d(z9);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qs.e4, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d, 402653184));
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.w5 w5Var = ((r8) childAt).a;
                        r8 r8Var3 = this.b;
                        float d10 = w5Var.d(childAt == r8Var3 && r8Var3.s);
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
            if ((z9 || d2 > 0.0f) && this.a != null) {
                if (this.F == null) {
                    this.F = ((f3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    r8 r8Var4 = this.a;
                    float T1 = org.telegram.messenger.g0.T1(1.0f, (r8Var4.y ? r8Var4.r.a(0.05f) : 1.0f) * 1.05f, d2);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * 0.2f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
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
                    canvas2.scale(this.a.getScaleX() * T1, this.a.getScaleY() * T1, this.a.getPivotX(), this.a.getPivotY());
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
        } else if (view instanceof r8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((r8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (this.G) {
            return;
        }
        this.G = true;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r8) {
                r8 r8Var = (r8) childAt;
                s7 s7Var = r8Var.H;
                if (r8Var.w) {
                    org.telegram.messenger.g0.r(s7Var);
                    org.telegram.messenger.g0.i3(s7Var, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z9;
        boolean z10;
        r8 r8Var;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        boolean z11;
        if (view instanceof r8) {
            float f14 = 2.0f;
            if (view instanceof w8) {
                w8 w8Var = (w8) view;
                TL_stories.MediaArea mediaArea = w8Var.b;
                i4 i4Var = ((f3) this).I;
                boolean z12 = i4Var.l1;
                g4 g4Var = i4Var.x1;
                if (!z12 && g4Var.a != null) {
                    ch.o0 d = ch.o0.d(mediaArea.reaction);
                    if (!d.equals(ch.o0.d(g4Var.a.sent_reaction))) {
                        i4Var.J0(d);
                    }
                }
                w8Var.performHapticFeedback(3);
                w8Var.K.a.P0(false);
                ix ixVar = i4Var.T0;
                Random random = ixVar.h;
                FrameLayout frameLayout = ixVar.G;
                ArrayList arrayList2 = ixVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                ch.o0 d2 = ch.o0.d(mediaArea.reaction);
                String str = d2.f;
                if (str == null) {
                    str = ij.U(org.telegram.ui.Components.i5.e(ixVar.b, d2.g));
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
                String p10 = ix.p(str);
                int hashCode = w8Var.hashCode();
                boolean z13 = w8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d2.f != null) {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z11 = z13;
                    if (ixVar.d(p10, hashCode, null, null, -1, false, false, f11, f10, z13)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        hx hxVar = (hx) jg.g.i(1, arrayList);
                        hxVar.getClass();
                        hxVar.e = f13;
                        hxVar.d = f12;
                        hxVar.a = w8Var.getTranslationX() - (hxVar.d / 2.0f);
                        float translationY = w8Var.getTranslationY();
                        float f15 = hxVar.d;
                        hxVar.b = translationY - (1.5f * f15);
                        if (hxVar.m) {
                            hxVar.a = ((-f15) * 1.8f) + hxVar.a;
                            return;
                        } else {
                            hxVar.a = ((-f15) * 0.2f) + hxVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z11 = z13;
                }
                if (d2.g == 0 || w8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i7 = 0;
                int i10 = 0;
                while (i7 < arrayList.size()) {
                    float f16 = f14;
                    Random random2 = random;
                    if (((hx) arrayList.get(i7)).k == d2.g) {
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
                hx hxVar2 = new hx();
                hxVar2.j = ch.d.a(w8Var.getAnimatedEmojiDrawable(), true, true);
                if (!hxVar2.i) {
                    hxVar2.f = ((random3.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    hxVar2.g = ((random3.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                hxVar2.p = hashCode;
                hxVar2.q = null;
                hxVar2.k = d2.g;
                hxVar2.m = z11;
                hxVar2.e = f13;
                hxVar2.d = f12;
                hxVar2.a = w8Var.getTranslationX() - (hxVar2.d / f17);
                float translationY2 = w8Var.getTranslationY();
                float f18 = hxVar2.d;
                hxVar2.b = translationY2 - (1.5f * f18);
                hxVar2.a = ((-f18) * 1.8f) + hxVar2.a;
                if (ixVar.n) {
                    hxVar2.j.f(frameLayout);
                }
                arrayList.add(hxVar2);
                return;
            }
            if (this.b == view) {
                org.telegram.messenger.g0.i3(new s7(this, r4), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((f3) this).H.N(new an(bundle));
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
                    vf.c.t(getContext(), "https://" + qp.s1(p10.s0).U2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                p8 p8Var = new p8(r4, 0);
                p8Var.w = true;
                p8Var.N0 = this.b.b;
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
                    p8Var.O0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                p8Var.P0 = false;
                p8Var.G0(new ij(p10.s0, tL_message, false, false));
                ((f3) this).H.N(p8Var);
                this.b = null;
                invalidate();
                return;
            }
            r8 r8Var2 = (r8) view;
            this.a = r8Var2;
            this.b = r8Var2;
            invalidate();
            fi.m3 m3Var = this.c;
            if (m3Var != null) {
                m3Var.f(true);
                this.c = null;
            }
            fi.m3 m3Var2 = new fi.m3(getContext(), 0);
            Paint paint = new Paint(1);
            m3Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(m3Var2.w));
            org.telegram.ui.Cells.y yVar = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new fi.l3(m3Var2, 0));
            m3Var2.a0 = yVar;
            yVar.setCallback(m3Var2);
            m3Var2.p(0.0f, this.b.getTranslationX() - org.telegram.messenger.g0.L(8.0f));
            m3Var2.d = 5000L;
            this.c = m3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131744448, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131744450, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    m3Var2.r(true);
                    spannableStringBuilder.append((CharSequence) hd.M0(2131744594, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), org.telegram.messenger.g0.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.r1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new q8(0), length, spannableStringBuilder.length(), 33);
                    m3Var2.n(11.0f, 7.0f, 11.0f, 7.0f);
                    z9 = true;
                    SpannableString spannableString = new SpannableString(">");
                    wp wpVar = new wp(R.drawable.photos_arrow, 0);
                    float L = org.telegram.messenger.g0.L(!z9 ? 1.0f : 2.0f);
                    float L2 = org.telegram.messenger.g0.L(!z9 ? 0.0f : 1.0f);
                    wpVar.r = L;
                    wpVar.s = L2;
                    spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    wp wpVar2 = new wp(R.drawable.attach_arrow_right, 0);
                    float L3 = org.telegram.messenger.g0.L(!z9 ? -1.0f : -2.0f);
                    float L4 = org.telegram.messenger.g0.L(z9 ? 0.0f : 1.0f);
                    wpVar2.r = L3;
                    wpVar2.s = L4;
                    wpVar2.H = -1.0f;
                    wpVar2.I = 1.0f;
                    spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                    if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">");
                    m3Var2.u(spannableStringBuilder);
                    m3Var2.q0 = new z0(24, this, m3Var2);
                    float f19 = !z9 ? 100 : 50;
                    z10 = this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f19)) >= ((float) org.telegram.messenger.g0.L(100.0f));
                    m3Var2.a = z10 ? 1 : 3;
                    r8Var = this.b;
                    if (!(r8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z10 ? (r8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19) >= org.telegram.messenger.g0.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + r8Var.getTranslationY() <= getMeasuredHeight() - org.telegram.messenger.g0.L(120.0f))) {
                        m3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z10) {
                        m3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19));
                    } else {
                        m3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    m3Var2.setOnClickListener(new ah.d(this, 17));
                    m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    this.d.addView(m3Var2, ha.c(f19, -1));
                    m3Var2.w();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) hd.M0(2131744449, null));
            }
            z9 = false;
            SpannableString spannableString3 = new SpannableString(">");
            wp wpVar3 = new wp(R.drawable.photos_arrow, 0);
            float L5 = org.telegram.messenger.g0.L(!z9 ? 1.0f : 2.0f);
            float L22 = org.telegram.messenger.g0.L(!z9 ? 0.0f : 1.0f);
            wpVar3.r = L5;
            wpVar3.s = L22;
            spannableString3.setSpan(wpVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            wp wpVar22 = new wp(R.drawable.attach_arrow_right, 0);
            float L32 = org.telegram.messenger.g0.L(!z9 ? -1.0f : -2.0f);
            float L42 = org.telegram.messenger.g0.L(z9 ? 0.0f : 1.0f);
            wpVar22.r = L32;
            wpVar22.s = L42;
            wpVar22.H = -1.0f;
            wpVar22.I = 1.0f;
            spannableString22.setSpan(wpVar22, 0, spannableString22.length(), 33);
            if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
            }
            org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString3, ">");
            m3Var2.u(spannableStringBuilder);
            m3Var2.q0 = new z0(24, this, m3Var2);
            float f192 = !z9 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f192)) >= ((float) org.telegram.messenger.g0.L(100.0f))) {
            }
            m3Var2.a = z10 ? 1 : 3;
            r8Var = this.b;
            if (!(r8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z10) {
            }
            m3Var2.setOnClickListener(new ah.d(this, 17));
            m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            this.d.addView(m3Var2, ha.c(f192, -1));
            m3Var2.w();
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i7, i12 - i10);
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
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
        fi.m3 m3Var;
        if (getChildCount() == 0 || (m3Var = this.c) == null || !m3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            fi.m3 m3Var2 = this.c;
            if (m3Var2 != null) {
                m3Var2.f(true);
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
