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
import c8.ma;
import c8.ra;
import hi.pb;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.bn;
import org.telegram.ui.mx;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public abstract class j8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.d6 E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public h8 a;
    public h8 b;
    public hi.l3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.h6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final org.telegram.ui.Components.d6 y;

    public j8(Context context, View view, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.n = h6Var;
        this.y = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        this.E = new org.telegram.ui.Components.d6(view, 0L, 360L, nr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(hi.c7 c7Var) {
        if (c7Var == null || c7Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c7Var.T0.size(); i7++) {
            if (((d20) c7Var.T0.get(i7)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((d20) c7Var.T0.get(i7)).M);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, nx nxVar) {
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
                    m8 m8Var = new m8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, nxVar);
                    if (storyItem != null) {
                        m8Var.c(storyItem.views, false);
                    }
                    ra.a(m8Var);
                    view = m8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    pb pbVar = new pb();
                    pbVar.c = tL_mediaAreaWeather.emoji;
                    pbVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    tg.n0 n0Var = new tg.n0(getContext(), org.telegram.messenger.g0.p);
                    n0Var.setMaxWidth(org.telegram.messenger.g0.q.x);
                    n0Var.setIsVideo(true);
                    n0Var.d(k10.t0, pbVar.c);
                    n0Var.setText(pbVar.a());
                    n0Var.e(3, tL_mediaAreaWeather.color);
                    view = new i8(getContext(), n0Var, mediaArea);
                } else {
                    view = new h8(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, nx nxVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, nxVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            h8 h8Var = this.b;
            float d = this.y.d((h8Var == null || !h8Var.s || h8Var.x) ? false : true);
            h8 h8Var2 = this.b;
            boolean z10 = h8Var2 != null && h8Var2.x;
            float d2 = this.E.d(z10);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ls.e4, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d, 402653184));
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.d6 d6Var = ((h8) childAt).a;
                        h8 h8Var3 = this.b;
                        float d10 = d6Var.d(childAt == h8Var3 && h8Var3.s);
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
                    this.G = ((y2) this).J.getPlayingBitmap();
                }
                if (this.G != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    h8 h8Var4 = this.a;
                    float T1 = org.telegram.messenger.g0.T1(1.0f, (h8Var4.y ? h8Var4.r.a(0.05f) : 1.0f) * 1.05f, d2);
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
        } else if (view instanceof h8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((h8) view).a(canvas);
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
            if (childAt instanceof h8) {
                h8 h8Var = (h8) childAt;
                f2.a aVar = h8Var.I;
                if (h8Var.w) {
                    org.telegram.messenger.g0.r(aVar);
                    org.telegram.messenger.g0.h3(aVar, 400L);
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
        h8 h8Var;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        boolean z12;
        if (view instanceof h8) {
            float f14 = 2.0f;
            if (view instanceof m8) {
                m8 m8Var = (m8) view;
                TL_stories.MediaArea mediaArea = m8Var.b;
                z3 z3Var = ((y2) this).J;
                boolean z13 = z3Var.m1;
                x3 x3Var = z3Var.y1;
                if (!z13 && x3Var.a != null) {
                    ch.p0 d = ch.p0.d(mediaArea.reaction);
                    if (!d.equals(ch.p0.d(x3Var.a.sent_reaction))) {
                        z3Var.J0(d);
                    }
                }
                m8Var.performHapticFeedback(3);
                m8Var.L.a.P0(false);
                nx nxVar = z3Var.U0;
                Random random = nxVar.h;
                FrameLayout frameLayout = nxVar.H;
                ArrayList arrayList2 = nxVar.G;
                if (arrayList2.size() > 12) {
                    return;
                }
                ch.p0 d2 = ch.p0.d(mediaArea.reaction);
                String str = d2.f;
                if (str == null) {
                    str = gj.U(org.telegram.ui.Components.p5.e(nxVar.b, d2.g));
                }
                float measuredHeight = m8Var.getMeasuredHeight();
                float measuredWidth = m8Var.getMeasuredWidth();
                View view2 = (View) m8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f11 = 0.4f * view2.getWidth();
                    f10 = f11;
                } else {
                    f10 = measuredHeight;
                    f11 = measuredWidth;
                }
                String p10 = nx.p(str);
                int hashCode = m8Var.hashCode();
                boolean z14 = m8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d2.f != null) {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                    if (nxVar.d(p10, hashCode, null, null, -1, false, false, f11, f10, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        mx mxVar = (mx) i5.c.h(1, arrayList);
                        mxVar.getClass();
                        mxVar.e = f13;
                        mxVar.d = f12;
                        mxVar.a = m8Var.getTranslationX() - (mxVar.d / 2.0f);
                        float translationY = m8Var.getTranslationY();
                        float f15 = mxVar.d;
                        mxVar.b = translationY - (1.5f * f15);
                        if (mxVar.m) {
                            mxVar.a = ((-f15) * 1.8f) + mxVar.a;
                            return;
                        } else {
                            mxVar.a = ((-f15) * 0.2f) + mxVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                }
                if (d2.g == 0 || m8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i7 = 0;
                int i10 = 0;
                while (i7 < arrayList.size()) {
                    float f16 = f14;
                    Random random2 = random;
                    if (((mx) arrayList.get(i7)).k == d2.g) {
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
                mx mxVar2 = new mx();
                mxVar2.j = ch.d.a(m8Var.getAnimatedEmojiDrawable(), true, true);
                if (!mxVar2.i) {
                    mxVar2.f = ((random3.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    mxVar2.g = ((random3.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                mxVar2.p = hashCode;
                mxVar2.q = null;
                mxVar2.k = d2.g;
                mxVar2.m = z12;
                mxVar2.e = f13;
                mxVar2.d = f12;
                mxVar2.a = m8Var.getTranslationX() - (mxVar2.d / f17);
                float translationY2 = m8Var.getTranslationY();
                float f18 = mxVar2.d;
                mxVar2.b = translationY2 - (1.5f * f18);
                mxVar2.a = ((-f18) * 1.8f) + mxVar2.a;
                if (nxVar.n) {
                    mxVar2.j.f(frameLayout);
                }
                arrayList.add(mxVar2);
                return;
            }
            if (this.b == view) {
                org.telegram.messenger.g0.h3(new f2.a(this, 20), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((y2) this).I.N(new bn(bundle));
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
                    vf.c.t(getContext(), "https://" + np.u1(k10.t0).X2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                f8 f8Var = new f8(r4, 0);
                f8Var.w = true;
                f8Var.T0 = this.b.b;
                f8Var.setResourceProvider(this.n);
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
                    f8Var.U0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                f8Var.V0 = false;
                f8Var.G0(new gj(k10.t0, tL_message, false, false));
                ((y2) this).I.N(f8Var);
                this.b = null;
                invalidate();
                return;
            }
            h8 h8Var2 = (h8) view;
            this.a = h8Var2;
            this.b = h8Var2;
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
                spannableStringBuilder.append((CharSequence) hd.N0(2131744204, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) hd.N0(2131744206, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    l3Var2.r(true);
                    spannableStringBuilder.append((CharSequence) hd.N0(2131744350, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), org.telegram.messenger.g0.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.r1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new g8(0), length, spannableStringBuilder.length(), 33);
                    l3Var2.n(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    nq nqVar = new nq(R.drawable.photos_arrow, 0);
                    float L = org.telegram.messenger.g0.L(!z10 ? 1.0f : 2.0f);
                    float L2 = org.telegram.messenger.g0.L(!z10 ? 0.0f : 1.0f);
                    nqVar.r = L;
                    nqVar.s = L2;
                    spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    nq nqVar2 = new nq(R.drawable.attach_arrow_right, 0);
                    float L3 = org.telegram.messenger.g0.L(!z10 ? -1.0f : -2.0f);
                    float L4 = org.telegram.messenger.g0.L(z10 ? 0.0f : 1.0f);
                    nqVar2.r = L3;
                    nqVar2.s = L4;
                    nqVar2.I = -1.0f;
                    nqVar2.J = 1.0f;
                    spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
                    if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">");
                    l3Var2.v(spannableStringBuilder);
                    l3Var2.r0 = new l4(19, this, l3Var2);
                    float f19 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f19)) >= ((float) org.telegram.messenger.g0.L(100.0f));
                    l3Var2.a = z11 ? 1 : 3;
                    h8Var = this.b;
                    if (!(h8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (h8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19) >= org.telegram.messenger.g0.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + h8Var.getTranslationY() <= getMeasuredHeight() - org.telegram.messenger.g0.L(120.0f))) {
                        l3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        l3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(f19));
                    } else {
                        l3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    l3Var2.setOnClickListener(new ah.d(this, 24));
                    l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    this.d.addView(l3Var2, ma.c(f19, -1));
                    l3Var2.x();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) hd.N0(2131744205, null));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            nq nqVar3 = new nq(R.drawable.photos_arrow, 0);
            float L5 = org.telegram.messenger.g0.L(!z10 ? 1.0f : 2.0f);
            float L22 = org.telegram.messenger.g0.L(!z10 ? 0.0f : 1.0f);
            nqVar3.r = L5;
            nqVar3.s = L22;
            spannableString3.setSpan(nqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            nq nqVar22 = new nq(R.drawable.attach_arrow_right, 0);
            float L32 = org.telegram.messenger.g0.L(!z10 ? -1.0f : -2.0f);
            float L42 = org.telegram.messenger.g0.L(z10 ? 0.0f : 1.0f);
            nqVar22.r = L32;
            nqVar22.s = L42;
            nqVar22.I = -1.0f;
            nqVar22.J = 1.0f;
            spannableString22.setSpan(nqVar22, 0, spannableString22.length(), 33);
            if (org.telegram.messenger.g0.L1(spannableStringBuilder)) {
            }
            org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString3, ">");
            l3Var2.v(spannableStringBuilder);
            l3Var2.r0 = new l4(19, this, l3Var2);
            float f192 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) org.telegram.messenger.g0.L(f192)) >= ((float) org.telegram.messenger.g0.L(100.0f))) {
            }
            l3Var2.a = z11 ? 1 : 3;
            h8Var = this.b;
            if (!(h8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            l3Var2.setOnClickListener(new ah.d(this, 24));
            l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            this.d.addView(l3Var2, ma.c(f192, -1));
            l3Var2.x();
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
            } else if (childAt instanceof h8) {
                h8 h8Var = (h8) childAt;
                TL_stories.MediaArea mediaArea = h8Var.b;
                int measuredWidth = h8Var.getMeasuredWidth();
                int measuredHeight = h8Var.getMeasuredHeight();
                h8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                h8Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                h8Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                h8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof i8) {
                i8 i8Var = (i8) childAt;
                TL_stories.MediaArea mediaArea2 = i8Var.a;
                int measuredWidth2 = i8Var.getMeasuredWidth();
                int measuredHeight2 = i8Var.getMeasuredHeight();
                i8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                i8Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                i8Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                i8Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof h8) {
                h8 h8Var = (h8) getChildAt(i11);
                h8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((h8Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((h8Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof i8) {
                i8 i8Var = (i8) getChildAt(i11);
                i8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((i8Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((i8Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
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
