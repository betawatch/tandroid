package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.xp;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 D;
    public int E;
    public final m.f3 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y a;
    public int b;
    public final org.telegram.ui.Components.l9 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.w8 n;
    public final int r;
    public final RectF s;
    public rd w;
    public la0 x;
    public final Location y;

    public r7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.E = p10.s0;
        this.F = new m.f3(this, 23);
        this.K = "";
        this.D = f6Var;
        this.r = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        qs.i(k5Var);
        k5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity(id.a0 ? 5 : 3);
        k5Var.setScrollNonFitText(true);
        if (z9) {
            boolean z10 = id.a0;
            addView(l9Var, c8.ha.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
            boolean z11 = id.a0;
            addView(k5Var, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? i7 : 73.0f, 12.0f, z11 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, f6Var);
            textView.setGravity(id.a0 ? 5 : 3);
            boolean z12 = id.a0;
            addView(textView, c8.ha.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? i7 : 73.0f, 33.0f, z12 ? 73.0f : i7, 0.0f));
        } else {
            boolean z13 = id.a0;
            addView(l9Var, c8.ha.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 15.0f, 6.0f, z13 ? 15.0f : 0.0f, 0.0f));
            boolean z14 = id.a0;
            addView(k5Var, c8.ha.d(-2, -2.0f, (z14 ? 5 : 3) | 48, z14 ? i7 : 74.0f, 17.0f, z14 ? 74.0f : i7, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        r7 r7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) > 1.0E-6d || Math.abs(this.I - d2) > 1.0E-6d || TextUtils.isEmpty(this.K)) {
            this.G = true;
            r7Var = this;
            Utilities.e.c(new q7(r7Var, d, d2, 0));
        } else {
            r7Var = this;
        }
        return r7Var.K;
    }

    public final void b(ij ijVar, Location location, boolean z9) {
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.Components.l9 l9Var = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        TextView textView = this.f;
        if (ijVar != null && (message = ijVar.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.bj, f6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, f6Var);
            y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.a = j02;
            this.b = w02;
            xp xpVar = new xp(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            xpVar.h = L;
            xpVar.n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            xpVar.e = L3;
            xpVar.f = L4;
            l9Var.setImageDrawable(xpVar);
            k5Var.l(org.telegram.messenger.i6.m(qp.s1(this.E).B1(org.telegram.messenger.m5.o(ijVar.k.peer_id), false), k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = ijVar.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = ijVar.Z0();
        if (ij.m3(ijVar.k)) {
            Z0 = ij.C1(ijVar.k.fwd_from.from_id);
        }
        this.E = ijVar.I1;
        String str2 = !TextUtils.isEmpty(ijVar.k.media.address) ? ijVar.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(ijVar.k.media.title);
        if (isEmpty) {
            this.n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User a22 = qp.s1(this.E).a2(Long.valueOf(Z0));
                if (a22 != null) {
                    this.n = new org.telegram.ui.Components.w8(0, a22);
                    charSequence = t10.p(a22);
                    l9Var.e(a22, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = ijVar.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat M0 = qp.s1(this.E).M0(Long.valueOf(-Z0));
                if (M0 != null) {
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(M0);
                    this.n = w8Var;
                    charSequence = M0.title;
                    l9Var.e(M0, w8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = ijVar.k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f10 = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.J = spannableString;
                spannableString.setSpan(new b80(k5Var, org.telegram.messenger.g0.L(100.0f), 0, f6Var), 0, this.J.length(), 33);
            }
            charSequence = this.J;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(ijVar.k.media.title)) {
                charSequence = ijVar.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.y(this, drawable2, org.telegram.ui.ActionBar.k6.bj, f6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, f6Var);
            y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.a = j03;
            this.b = w03;
            xp xpVar2 = new xp(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            xpVar2.h = L5;
            xpVar2.n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            xpVar2.e = L7;
            xpVar2.f = L8;
            l9Var.setImageDrawable(xpVar2);
        }
        k5Var.l(charSequence, false);
        double d = ijVar.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(ijVar.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z9) {
                textView.setText("");
                return;
            } else {
                textView.setText(id.M0(2131748780, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(id.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + id.y(distanceTo, 0, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.F);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        rd rdVar = this.w;
        if (rdVar == null && this.x == null) {
            return;
        }
        if (rdVar != null) {
            i10 = rdVar.c;
            i7 = rdVar.d;
        } else {
            TLRPC.Message message = this.x.b;
            int i11 = message.date;
            i7 = message.media.period;
            i10 = i11 + i7;
        }
        int i12 = i10;
        boolean z9 = i7 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.E).getCurrentTime();
        if (i12 >= currentTime || z9) {
            float abs = z9 ? 1.0f : Math.abs(i12 - currentTime) / i7;
            boolean z10 = id.a0;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z10) {
                rectF.set(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.D;
            int w02 = textView == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.mj, f6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, f6Var);
            org.telegram.ui.ActionBar.k6.l2.setColor(w02);
            org.telegram.ui.ActionBar.k6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
            org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            if (!z9) {
                String C = id.C(i12 - currentTime);
                canvas.drawText(C, rectF.centerX() - (org.telegram.ui.ActionBar.k6.F2.measureText(C) / 2.0f), org.telegram.messenger.g0.L(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.k6.F2);
                return;
            }
            if (this.L == null) {
                this.L = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.M) {
                Drawable drawable = this.L;
                int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                this.M = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.L.setBounds(f1.z(2, (int) rectF.centerX(), this.L), f1.y(2, (int) rectF.centerY(), this.L), f1.w(2, (int) rectF.centerX(), this.L), f1.f(2, (int) rectF.centerY(), this.L));
            this.L.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-org.telegram.messenger.g0.L(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(rd rdVar) {
        this.w = rdVar;
        this.E = rdVar.e;
        org.telegram.ui.Components.l9 l9Var = this.c;
        l9Var.getImageReceiver().d = this.E;
        boolean E = org.telegram.messenger.m5.E(rdVar.a);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (E) {
            TLRPC.User a22 = qp.s1(this.E).a2(Long.valueOf(rdVar.a));
            if (a22 != null) {
                this.n.r(a22);
                k5Var.l(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name), false);
                l9Var.e(a22, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = qp.s1(this.E).M0(Long.valueOf(-rdVar.a));
        if (M0 != null) {
            this.n.q(M0);
            k5Var.l(M0.title, false);
            l9Var.e(M0, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, this.D)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.k6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.k6.H1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.l9 l9Var = this.c;
            if (l9Var != null) {
                l9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
