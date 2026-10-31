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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.md;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.sb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 D;
    public int E;
    public final mg.c2 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y a;
    public int b;
    public final org.telegram.ui.Components.g9 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.r8 n;
    public final int r;
    public final RectF s;
    public md w;
    public sb0 x;
    public final Location y;

    public v7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.E = d20.s0;
        this.F = new mg.c2(this, 21);
        this.K = "";
        this.D = p6Var;
        this.r = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        this.n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        zs.i(u5Var);
        u5Var.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setGravity(cd.X ? 5 : 3);
        u5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = cd.X;
            addView(g9Var, w7.b6.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = cd.X;
            addView(u5Var, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
            textView.setGravity(cd.X ? 5 : 3);
            boolean z13 = cd.X;
            addView(textView, w7.b6.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 73.0f, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = cd.X;
            addView(g9Var, w7.b6.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = cd.X;
            addView(u5Var, w7.b6.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i10 : 74.0f, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        v7 v7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) > 1.0E-6d || Math.abs(this.I - d10) > 1.0E-6d || TextUtils.isEmpty(this.K)) {
            this.G = true;
            v7Var = this;
            Utilities.e.c(new u7(v7Var, d, d10, 0));
        } else {
            v7Var = this;
        }
        return v7Var.K;
    }

    public final void b(jj jjVar, Location location, boolean z10) {
        float f7;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.Components.g9 g9Var = this.c;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        TextView textView = this.f;
        if (jjVar != null && (message = jjVar.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, p6Var);
            y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(42.0f), w02, w02);
            this.a = j02;
            this.b = w02;
            eq eqVar = new eq(j02, drawable);
            int L = org.telegram.messenger.i0.L(42.0f);
            int L2 = org.telegram.messenger.i0.L(42.0f);
            eqVar.h = L;
            eqVar.n = L2;
            int L3 = org.telegram.messenger.i0.L(24.0f);
            int L4 = org.telegram.messenger.i0.L(24.0f);
            eqVar.e = L3;
            eqVar.f = L4;
            g9Var.setImageDrawable(eqVar);
            u5Var.l(org.telegram.messenger.k6.m(vp.r1(this.E).A1(org.telegram.messenger.o5.o(jjVar.k.peer_id), false), u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = jjVar.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = jjVar.Z0();
        if (jj.l3(jjVar.k)) {
            Z0 = jj.C1(jjVar.k.fwd_from.from_id);
        }
        this.E = jjVar.I1;
        String str2 = !TextUtils.isEmpty(jjVar.k.media.address) ? jjVar.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(jjVar.k.media.title);
        if (isEmpty) {
            this.n = null;
            if (Z0 > 0) {
                f7 = 42.0f;
                TLRPC.User Z1 = vp.r1(this.E).Z1(Long.valueOf(Z0));
                if (Z1 != null) {
                    this.n = new org.telegram.ui.Components.r8(0, Z1);
                    charSequence = h20.p(Z1);
                    g9Var.e(Z1, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = jjVar.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f7 = 42.0f;
                TLRPC.Chat L0 = vp.r1(this.E).L0(Long.valueOf(-Z0));
                if (L0 != null) {
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(L0);
                    this.n = r8Var;
                    charSequence = L0.title;
                    g9Var.e(L0, r8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = jjVar.k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f7 = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.J = spannableString;
                spannableString.setSpan(new u80(u5Var, org.telegram.messenger.i0.L(100.0f), 0, p6Var), 0, this.J.length(), 33);
            }
            charSequence = this.J;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(jjVar.k.media.title)) {
                charSequence = jjVar.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.a7.y(this, drawable2, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, p6Var);
            y j03 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(f7), w03, w03);
            this.a = j03;
            this.b = w03;
            eq eqVar2 = new eq(j03, drawable2);
            int L5 = org.telegram.messenger.i0.L(f7);
            int L6 = org.telegram.messenger.i0.L(f7);
            eqVar2.h = L5;
            eqVar2.n = L6;
            int L7 = org.telegram.messenger.i0.L(24.0f);
            int L8 = org.telegram.messenger.i0.L(24.0f);
            eqVar2.e = L7;
            eqVar2.f = L8;
            g9Var.setImageDrawable(eqVar2);
        }
        u5Var.l(charSequence, false);
        double d = jjVar.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(jjVar.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z10) {
                textView.setText("");
                return;
            } else {
                textView.setText(cd.L0(2131748789, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(cd.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + cd.y(distanceTo, 0, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.g3(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.F);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        md mdVar = this.w;
        if (mdVar == null && this.x == null) {
            return;
        }
        if (mdVar != null) {
            i11 = mdVar.c;
            i10 = mdVar.d;
        } else {
            TLRPC.Message message = this.x.b;
            int i12 = message.date;
            i10 = message.media.period;
            i11 = i12 + i10;
        }
        int i13 = i11;
        boolean z10 = i10 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.E).getCurrentTime();
        if (i13 >= currentTime || z10) {
            float abs = z10 ? 1.0f : Math.abs(i13 - currentTime) / i10;
            boolean z11 = cd.X;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z11) {
                rectF.set(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(textView != null ? 18.0f : 12.0f), org.telegram.messenger.i0.L(43.0f), org.telegram.messenger.i0.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f), org.telegram.messenger.i0.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.D;
            int w02 = textView == null ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.mj, p6Var) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.gj, p6Var);
            org.telegram.ui.ActionBar.t6.l2.setColor(w02);
            org.telegram.ui.ActionBar.t6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.t6.l2.getAlpha();
            org.telegram.ui.ActionBar.t6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.t6.l2);
            org.telegram.ui.ActionBar.t6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.t6.l2);
            org.telegram.ui.ActionBar.t6.l2.setAlpha(alpha);
            if (!z10) {
                String C = cd.C(i13 - currentTime);
                canvas.drawText(C, rectF.centerX() - (org.telegram.ui.ActionBar.t6.F2.measureText(C) / 2.0f), org.telegram.messenger.i0.L(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.t6.F2);
                return;
            }
            if (this.L == null) {
                this.L = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.t6.F2.getColor() != this.M) {
                Drawable drawable = this.L;
                int color = org.telegram.ui.ActionBar.t6.F2.getColor();
                this.M = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.L.setBounds(f1.z(2, (int) rectF.centerX(), this.L), f1.y(2, (int) rectF.centerY(), this.L), f1.w(2, (int) rectF.centerX(), this.L), f1.f(2, (int) rectF.centerY(), this.L));
            this.L.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-org.telegram.messenger.i0.L(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(md mdVar) {
        this.w = mdVar;
        this.E = mdVar.e;
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.getImageReceiver().d = this.E;
        boolean E = org.telegram.messenger.o5.E(mdVar.a);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        if (E) {
            TLRPC.User Z1 = vp.r1(this.E).Z1(Long.valueOf(mdVar.a));
            if (Z1 != null) {
                this.n.r(Z1);
                u5Var.l(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name), false);
                g9Var.e(Z1, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = vp.r1(this.E).L0(Long.valueOf(-mdVar.a));
        if (L0 != null) {
            this.n.q(L0);
            u5Var.l(L0.title, false);
            g9Var.e(L0, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, this.D)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.t6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.t6.H1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.g9 g9Var = this.c;
            if (g9Var != null) {
                g9Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
