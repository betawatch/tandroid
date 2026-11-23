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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.qd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.r80;
import org.telegram.ui.ma0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 E;
    public int F;
    public final j6.o G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public y a;
    public int b;
    public final org.telegram.ui.Components.q9 c;
    public final org.telegram.ui.ActionBar.m5 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.b9 n;
    public final int r;
    public final RectF s;
    public qd w;
    public ma0 x;
    public final Location y;

    public s7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.F = k10.t0;
        this.G = new j6.o(this, 26);
        this.L = "";
        this.E = h6Var;
        this.r = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        ls.i(m5Var);
        m5Var.setTextSize(16);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setGravity(hd.a0 ? 5 : 3);
        m5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = hd.a0;
            addView(q9Var, c8.ma.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = hd.a0;
            addView(m5Var, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i7 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A6, h6Var);
            textView.setGravity(hd.a0 ? 5 : 3);
            boolean z13 = hd.a0;
            addView(textView, c8.ma.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i7 : 73.0f, 33.0f, z13 ? 73.0f : i7, 0.0f));
        } else {
            boolean z14 = hd.a0;
            addView(q9Var, c8.ma.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = hd.a0;
            addView(m5Var, c8.ma.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i7 : 74.0f, 17.0f, z15 ? 74.0f : i7, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        s7 s7Var;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) > 1.0E-6d || Math.abs(this.J - d2) > 1.0E-6d || TextUtils.isEmpty(this.L)) {
            this.H = true;
            s7Var = this;
            Utilities.e.c(new r7(s7Var, d, d2, 0));
        } else {
            s7Var = this;
        }
        return s7Var.L;
    }

    public final void b(gj gjVar, Location location, boolean z10) {
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        org.telegram.ui.Components.q9 q9Var = this.c;
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        TextView textView = this.f;
        if (gjVar != null && (message = gjVar.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.ej, h6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kj, h6Var);
            y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.a = j02;
            this.b = w02;
            oq oqVar = new oq(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            oqVar.h = L;
            oqVar.n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            oqVar.e = L3;
            oqVar.f = L4;
            q9Var.setImageDrawable(oqVar);
            m5Var.l(org.telegram.messenger.j6.m(np.u1(this.F).D1(org.telegram.messenger.n5.o(gjVar.k.peer_id), false), m5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = gjVar.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = gjVar.Z0();
        if (gj.l3(gjVar.k)) {
            Z0 = gj.B1(gjVar.k.fwd_from.from_id);
        }
        this.F = gjVar.K1;
        String str2 = !TextUtils.isEmpty(gjVar.k.media.address) ? gjVar.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(gjVar.k.media.title);
        if (isEmpty) {
            this.n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User c22 = np.u1(this.F).c2(Long.valueOf(Z0));
                if (c22 != null) {
                    this.n = new org.telegram.ui.Components.b9(0, c22);
                    charSequence = p10.q(c22);
                    q9Var.f(c22, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = gjVar.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat O0 = np.u1(this.F).O0(Long.valueOf(-Z0));
                if (O0 != null) {
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(O0);
                    this.n = b9Var;
                    charSequence = O0.title;
                    q9Var.f(O0, b9Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = gjVar.k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f10 = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.K == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.K = spannableString;
                spannableString.setSpan(new r80(m5Var, org.telegram.messenger.g0.L(100.0f), 0, h6Var), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(gjVar.k.media.title)) {
                charSequence = gjVar.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.t6.x(this, drawable2, org.telegram.ui.ActionBar.m6.ej, h6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kj, h6Var);
            y j03 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.a = j03;
            this.b = w03;
            oq oqVar2 = new oq(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            oqVar2.h = L5;
            oqVar2.n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            oqVar2.e = L7;
            oqVar2.f = L8;
            q9Var.setImageDrawable(oqVar2);
        }
        m5Var.l(charSequence, false);
        double d = gjVar.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(gjVar.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z10) {
                textView.setText("");
                return;
            } else {
                textView.setText(hd.N0(2131748586, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(hd.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + hd.y(distanceTo, 0, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.g3(this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.G);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        qd qdVar = this.w;
        if (qdVar == null && this.x == null) {
            return;
        }
        if (qdVar != null) {
            i10 = qdVar.c;
            i7 = qdVar.d;
        } else {
            TLRPC.Message message = this.x.b;
            int i11 = message.date;
            i7 = message.media.period;
            i10 = i11 + i7;
        }
        int i12 = i10;
        boolean z10 = i7 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.F).getCurrentTime();
        if (i12 >= currentTime || z10) {
            float abs = z10 ? 1.0f : Math.abs(i12 - currentTime) / i7;
            boolean z11 = hd.a0;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z11) {
                rectF.set(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.h6 h6Var = this.E;
            int w02 = textView == null ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.pj, h6Var) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.jj, h6Var);
            org.telegram.ui.ActionBar.m6.l2.setColor(w02);
            org.telegram.ui.ActionBar.m6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.m6.l2.getAlpha();
            org.telegram.ui.ActionBar.m6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.m6.l2);
            org.telegram.ui.ActionBar.m6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.m6.l2);
            org.telegram.ui.ActionBar.m6.l2.setAlpha(alpha);
            if (!z10) {
                String C = hd.C(i12 - currentTime);
                canvas.drawText(C, rectF.centerX() - (org.telegram.ui.ActionBar.m6.F2.measureText(C) / 2.0f), org.telegram.messenger.g0.L(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.m6.F2);
                return;
            }
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.m6.F2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = org.telegram.ui.ActionBar.m6.F2.getColor();
                this.N = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.M.setBounds(c0.C(2, (int) rectF.centerX(), this.M), c0.A(2, (int) rectF.centerY(), this.M), c0.y(2, (int) rectF.centerX(), this.M), c0.j(2, (int) rectF.centerY(), this.M));
            this.M.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-org.telegram.messenger.g0.L(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(qd qdVar) {
        this.w = qdVar;
        this.F = qdVar.e;
        org.telegram.ui.Components.q9 q9Var = this.c;
        q9Var.getImageReceiver().d = this.F;
        boolean E = org.telegram.messenger.n5.E(qdVar.a);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        if (E) {
            TLRPC.User c22 = np.u1(this.F).c2(Long.valueOf(qdVar.a));
            if (c22 != null) {
                this.n.r(c22);
                m5Var.l(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name), false);
                q9Var.f(c22, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat O0 = np.u1(this.F).O0(Long.valueOf(-qdVar.a));
        if (O0 != null) {
            this.n.q(O0);
            m5Var.l(O0.title, false);
            q9Var.f(O0, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kj, this.E)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.m6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.m6.H1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.q9 q9Var = this.c;
            if (q9Var != null) {
                q9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
