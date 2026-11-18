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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.pd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ma0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 E;
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
    public final org.telegram.ui.ActionBar.n5 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.b9 n;
    public final int r;
    public final RectF s;
    public pd w;
    public ma0 x;
    public final Location y;

    public s7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.F = j10.t0;
        this.G = new j6.o(this, 26);
        this.L = "";
        this.E = i6Var;
        this.r = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        ks.i(n5Var);
        n5Var.setTextSize(16);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setGravity(gd.a0 ? 5 : 3);
        n5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = gd.a0;
            addView(q9Var, c8.ma.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = gd.a0;
            addView(n5Var, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i7 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
            textView.setGravity(gd.a0 ? 5 : 3);
            boolean z13 = gd.a0;
            addView(textView, c8.ma.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i7 : 73.0f, 33.0f, z13 ? 73.0f : i7, 0.0f));
        } else {
            boolean z14 = gd.a0;
            addView(q9Var, c8.ma.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = gd.a0;
            addView(n5Var, c8.ma.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i7 : 74.0f, 17.0f, z15 ? 74.0f : i7, 0.0f));
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

    public final void b(fj fjVar, Location location, boolean z10) {
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.Components.q9 q9Var = this.c;
        org.telegram.ui.ActionBar.i6 i6Var = this.E;
        TextView textView = this.f;
        if (fjVar != null && (message = fjVar.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.ej, i6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kj, i6Var);
            y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.a = j02;
            this.b = w02;
            mq mqVar = new mq(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            mqVar.h = L;
            mqVar.n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            mqVar.e = L3;
            mqVar.f = L4;
            q9Var.setImageDrawable(mqVar);
            n5Var.l(org.telegram.messenger.j6.m(mp.u1(this.F).D1(org.telegram.messenger.n5.o(fjVar.k.peer_id), false), n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = fjVar.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = fjVar.Z0();
        if (fj.l3(fjVar.k)) {
            Z0 = fj.B1(fjVar.k.fwd_from.from_id);
        }
        this.F = fjVar.K1;
        String str2 = !TextUtils.isEmpty(fjVar.k.media.address) ? fjVar.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(fjVar.k.media.title);
        if (isEmpty) {
            this.n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User c22 = mp.u1(this.F).c2(Long.valueOf(Z0));
                if (c22 != null) {
                    this.n = new org.telegram.ui.Components.b9(0, c22);
                    charSequence = o10.q(c22);
                    q9Var.f(c22, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = fjVar.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat O0 = mp.u1(this.F).O0(Long.valueOf(-Z0));
                if (O0 != null) {
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(O0);
                    this.n = b9Var;
                    charSequence = O0.title;
                    q9Var.f(O0, b9Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = fjVar.k.media.geo;
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
                spannableString.setSpan(new p80(n5Var, org.telegram.messenger.g0.L(100.0f), 0, i6Var), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(fjVar.k.media.title)) {
                charSequence = fjVar.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.u6.x(this, drawable2, org.telegram.ui.ActionBar.n6.ej, i6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kj, i6Var);
            y j03 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.a = j03;
            this.b = w03;
            mq mqVar2 = new mq(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            mqVar2.h = L5;
            mqVar2.n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            mqVar2.e = L7;
            mqVar2.f = L8;
            q9Var.setImageDrawable(mqVar2);
        }
        n5Var.l(charSequence, false);
        double d = fjVar.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(fjVar.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z10) {
                textView.setText("");
                return;
            } else {
                textView.setText(gd.M0(2131748587, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(gd.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + gd.y(distanceTo, 0, null));
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
        pd pdVar = this.w;
        if (pdVar == null && this.x == null) {
            return;
        }
        if (pdVar != null) {
            i10 = pdVar.c;
            i7 = pdVar.d;
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
            boolean z11 = gd.a0;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z11) {
                rectF.set(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), org.telegram.messenger.g0.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.i6 i6Var = this.E;
            int w02 = textView == null ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.pj, i6Var) : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.jj, i6Var);
            org.telegram.ui.ActionBar.n6.l2.setColor(w02);
            org.telegram.ui.ActionBar.n6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.n6.l2.getAlpha();
            org.telegram.ui.ActionBar.n6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.n6.l2);
            org.telegram.ui.ActionBar.n6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.n6.l2);
            org.telegram.ui.ActionBar.n6.l2.setAlpha(alpha);
            if (!z10) {
                String C = gd.C(i12 - currentTime);
                canvas.drawText(C, rectF.centerX() - (org.telegram.ui.ActionBar.n6.F2.measureText(C) / 2.0f), org.telegram.messenger.g0.L(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.n6.F2);
                return;
            }
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.n6.F2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = org.telegram.ui.ActionBar.n6.F2.getColor();
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

    public void setDialog(pd pdVar) {
        this.w = pdVar;
        this.F = pdVar.e;
        org.telegram.ui.Components.q9 q9Var = this.c;
        q9Var.getImageReceiver().d = this.F;
        boolean E = org.telegram.messenger.n5.E(pdVar.a);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (E) {
            TLRPC.User c22 = mp.u1(this.F).c2(Long.valueOf(pdVar.a));
            if (c22 != null) {
                this.n.r(c22);
                n5Var.l(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name), false);
                q9Var.f(c22, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat O0 = mp.u1(this.F).O0(Long.valueOf(-pdVar.a));
        if (O0 != null) {
            this.n.q(O0);
            n5Var.l(O0.title, false);
            q9Var.f(O0, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kj, this.E)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.n6.H1(this.a, w02, false);
            org.telegram.ui.ActionBar.n6.H1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.q9 q9Var = this.c;
            if (q9Var != null) {
                q9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
