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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.kd;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ha0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 E;
    public int F;
    public final mi.b0 G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public y a;
    public int b;
    public final org.telegram.ui.Components.k9 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.u8 n;
    public final int r;
    public final RectF s;
    public kd w;
    public ha0 x;
    public final Location y;

    public q7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.F = h10.t0;
        this.G = new mi.b0(this, 22);
        this.L = "";
        this.E = e6Var;
        this.r = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        hs.i(k5Var);
        k5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity(bd.a0 ? 5 : 3);
        k5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = bd.a0;
            addView(k9Var, mf.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = bd.a0;
            addView(k5Var, mf.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i3 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
            textView.setGravity(bd.a0 ? 5 : 3);
            boolean z13 = bd.a0;
            addView(textView, mf.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i3 : 73.0f, 33.0f, z13 ? 73.0f : i3, 0.0f));
        } else {
            boolean z14 = bd.a0;
            addView(k9Var, mf.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = bd.a0;
            addView(k5Var, mf.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i3 : 74.0f, 17.0f, z15 ? 74.0f : i3, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        q7 q7Var;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) > 1.0E-6d || Math.abs(this.J - d10) > 1.0E-6d || TextUtils.isEmpty(this.L)) {
            this.H = true;
            q7Var = this;
            Utilities.e.c(new p7(q7Var, d, d10, 0));
        } else {
            q7Var = this;
        }
        return q7Var.L;
    }

    public final void b(zi ziVar, Location location, boolean z10) {
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.Components.k9 k9Var = this.c;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        TextView textView = this.f;
        if (ziVar != null && (message = ziVar.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.bj, e6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, e6Var);
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
            k9Var.setImageDrawable(xpVar);
            k5Var.l(org.telegram.messenger.i6.m(hp.s1(this.F).B1(org.telegram.messenger.m5.o(ziVar.k.peer_id), false), k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = ziVar.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = ziVar.Z0();
        if (zi.m3(ziVar.k)) {
            Z0 = zi.C1(ziVar.k.fwd_from.from_id);
        }
        this.F = ziVar.I1;
        String str2 = !TextUtils.isEmpty(ziVar.k.media.address) ? ziVar.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(ziVar.k.media.title);
        if (isEmpty) {
            this.n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User a22 = hp.s1(this.F).a2(Long.valueOf(Z0));
                if (a22 != null) {
                    this.n = new org.telegram.ui.Components.u8(0, a22);
                    charSequence = l10.p(a22);
                    k9Var.e(a22, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = ziVar.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat M0 = hp.s1(this.F).M0(Long.valueOf(-Z0));
                if (M0 != null) {
                    org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(M0);
                    this.n = u8Var;
                    charSequence = M0.title;
                    k9Var.e(M0, u8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = ziVar.k.media.geo;
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
                spannableString.setSpan(new x70(k5Var, org.telegram.messenger.g0.L(100.0f), 0, e6Var), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(ziVar.k.media.title)) {
                charSequence = ziVar.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.y(this, drawable2, org.telegram.ui.ActionBar.k6.bj, e6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, e6Var);
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
            k9Var.setImageDrawable(xpVar2);
        }
        k5Var.l(charSequence, false);
        double d = ziVar.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(ziVar.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z10) {
                textView.setText("");
                return;
            } else {
                textView.setText(bd.M0(2131748787, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(bd.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + bd.y(distanceTo, 0, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.G);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        kd kdVar = this.w;
        if (kdVar == null && this.x == null) {
            return;
        }
        if (kdVar != null) {
            i10 = kdVar.c;
            i3 = kdVar.d;
        } else {
            TLRPC.Message message = this.x.b;
            int i11 = message.date;
            i3 = message.media.period;
            i10 = i11 + i3;
        }
        int i12 = i10;
        boolean z10 = i3 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.F).getCurrentTime();
        if (i12 >= currentTime || z10) {
            float abs = z10 ? 1.0f : Math.abs(i12 - currentTime) / i3;
            boolean z11 = bd.a0;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z11) {
                rectF.set(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.E;
            int w02 = textView == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.mj, e6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, e6Var);
            org.telegram.ui.ActionBar.k6.l2.setColor(w02);
            org.telegram.ui.ActionBar.k6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
            org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            if (!z10) {
                String C = bd.C(i12 - currentTime);
                canvas.drawText(C, rectF.centerX() - (org.telegram.ui.ActionBar.k6.F2.measureText(C) / 2.0f), org.telegram.messenger.g0.L(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.k6.F2);
                return;
            }
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                this.N = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.M.setBounds(f1.C(2, (int) rectF.centerX(), this.M), f1.B(2, (int) rectF.centerY(), this.M), f1.z(2, (int) rectF.centerX(), this.M), f1.i(2, (int) rectF.centerY(), this.M));
            this.M.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-org.telegram.messenger.g0.L(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(kd kdVar) {
        this.w = kdVar;
        this.F = kdVar.e;
        org.telegram.ui.Components.k9 k9Var = this.c;
        k9Var.getImageReceiver().d = this.F;
        boolean E = org.telegram.messenger.m5.E(kdVar.a);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (E) {
            TLRPC.User a22 = hp.s1(this.F).a2(Long.valueOf(kdVar.a));
            if (a22 != null) {
                this.n.r(a22);
                k5Var.l(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name), false);
                k9Var.e(a22, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = hp.s1(this.F).M0(Long.valueOf(-kdVar.a));
        if (M0 != null) {
            this.n.q(M0);
            k5Var.l(M0.title, false);
            k9Var.e(M0, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, this.E)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.k6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.k6.H1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.k9 k9Var = this.c;
            if (k9Var != null) {
                k9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
