// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jia extends FrameLayout implements vlb {
    public final ylb E;
    public int F;
    public final ei7 G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public fg0 a;
    public int b;
    public final bf0 c;
    public final lka d;
    public int e;
    public final TextView f;
    public boolean h;
    public pc0 n;
    public final byte r;
    public final RectF s;
    public cd6 w;
    public kc6 x;
    public final Location y;

    /* JADX WARN: Multi-variable type inference failed */
    public jia(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.F = z8c.t0;
        this.G = new ei7(this, (byte) 28);
        this.L = "";
        this.E = ylbVar;
        this.r = i;
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(21.0f));
        this.n = new pc0((ylb) null);
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        nm7.i(lkaVar);
        lkaVar.setTextSize(16);
        anb.W(lkaVar, cmb.F6, ylbVar);
        lkaVar.setTypeface(gm.o());
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        lkaVar.setScrollNonFitText(true);
        boolean z2 = jb6.a0;
        if (z) {
            addView(bf0Var, qoe.d(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 12.0f, z2 ? 15.0f : 0.0f, 0.0f));
            boolean z3 = jb6.a0;
            addView(lkaVar, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? i : 73.0f, 12.0f, z3 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            anb.X(textView, cmb.z6, ylbVar);
            textView.setGravity(jb6.a0 ? 5 : 3);
            boolean z4 = jb6.a0;
            addView(textView, qoe.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? i : 73.0f, 33.0f, z4 ? 73.0f : i, 0.0f));
        } else {
            addView(bf0Var, qoe.d(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 6.0f, z2 ? 15.0f : 0.0f, 0.0f));
            boolean z5 = jb6.a0;
            addView(lkaVar, qoe.d(-2, -2.0f, (z5 ? 5 : 3) | 48, z5 ? i : 74.0f, 17.0f, z5 ? 74.0f : i, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        jia jiaVar;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) > 1.0E-6d || Math.abs(this.J - d2) > 1.0E-6d || TextUtils.isEmpty(this.L)) {
            this.H = true;
            jiaVar = this;
            Utilities.e.c(new iia(jiaVar, d, d2, (byte) 0));
        } else {
            jiaVar = this;
        }
        return jiaVar.L;
    }

    public final void b(k47 k47Var, Location location, boolean z) {
        float f;
        CharSequence charSequence;
        TLRPC.Message message;
        lka lkaVar = this.d;
        bf0 bf0Var = this.c;
        ylb ylbVar = this.E;
        TextView textView = this.f;
        if (k47Var != null && (message = k47Var.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            anb.x(this, drawable, cmb.dj, ylbVar, PorterDuff.Mode.MULTIPLY);
            int v0 = cmb.v0(cmb.jj, ylbVar);
            fg0 h0 = cmb.h0(gm.L(42.0f), v0, v0);
            this.a = h0;
            this.b = v0;
            sn2 sn2Var = new sn2(h0, drawable);
            int L = gm.L(42.0f);
            int L2 = gm.L(42.0f);
            sn2Var.h = L;
            sn2Var.n = L2;
            int L3 = gm.L(24.0f);
            int L4 = gm.L(24.0f);
            sn2Var.e = L3;
            sn2Var.f = L4;
            bf0Var.setImageDrawable(sn2Var);
            lkaVar.l(b10.e(lkaVar, oc7.r1(this.F).z1(pg3.n(k47Var.k.peer_id), false), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = k47Var.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), gm.q.x - gm.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = k47Var.Z0();
        if (k47.l3(k47Var.k)) {
            Z0 = k47.B1(k47Var.k.fwd_from.from_id);
        }
        this.F = k47Var.K1;
        String str2 = !TextUtils.isEmpty(k47Var.k.media.address) ? k47Var.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(k47Var.k.media.title);
        if (isEmpty) {
            this.n = null;
            f = 42.0f;
            int i = this.F;
            if (Z0 > 0) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(Z0));
                if (W1 != null) {
                    this.n = new pc0(0, W1);
                    charSequence = m9c.r(W1);
                    bf0Var.f(W1, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = k47Var.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-Z0));
                if (L0 != null) {
                    pc0 pc0Var = new pc0(L0);
                    this.n = pc0Var;
                    charSequence = L0.title;
                    bf0Var.f(L0, pc0Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = k47Var.k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.K == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.K = spannableString;
                spannableString.setSpan(new ta6(lkaVar, gm.L(100.0f), 0, ylbVar), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(k47Var.k.media.title)) {
                charSequence = k47Var.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            anb.x(this, drawable2, cmb.dj, ylbVar, PorterDuff.Mode.MULTIPLY);
            int v02 = cmb.v0(cmb.jj, ylbVar);
            fg0 h02 = cmb.h0(gm.L(f), v02, v02);
            this.a = h02;
            this.b = v02;
            sn2 sn2Var2 = new sn2(h02, drawable2);
            int L5 = gm.L(f);
            int L6 = gm.L(f);
            sn2Var2.h = L5;
            sn2Var2.n = L6;
            int L7 = gm.L(24.0f);
            int L8 = gm.L(24.0f);
            sn2Var2.e = L7;
            sn2Var2.f = L8;
            bf0Var.setImageDrawable(sn2Var2);
        }
        lkaVar.l(charSequence, false);
        double d = k47Var.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(k47Var.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z) {
                textView.setText("");
                return;
            } else {
                textView.setText(jb6.M0(2131748536, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(jb6.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + jb6.y(distanceTo, 0, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.c3(this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.G);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        cd6 cd6Var = this.w;
        if (cd6Var == null) {
            kc6 kc6Var = this.x;
            if (kc6Var == null) {
                return;
            }
            TLRPC.Message message = kc6Var.b;
            int i3 = message.date;
            i2 = message.media.period;
            i = i3 + i2;
        } else {
            i = cd6Var.c;
            i2 = cd6Var.d;
        }
        int i4 = i;
        boolean z = i2 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.F).getCurrentTime();
        if (i4 >= currentTime || z) {
            float abs = z ? 1.0f : Math.abs(i4 - currentTime) / i2;
            boolean z2 = jb6.a0;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z2) {
                rectF.set(gm.L(13.0f), gm.L(textView != null ? 18.0f : 12.0f), gm.L(43.0f), gm.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - gm.L(43.0f), gm.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - gm.L(13.0f), gm.L(textView == null ? 42.0f : 48.0f));
            }
            ylb ylbVar = this.E;
            int v0 = textView == null ? cmb.v0(cmb.oj, ylbVar) : cmb.v0(cmb.ij, ylbVar);
            cmb.k2.setColor(v0);
            cmb.E2.setColor(v0);
            int alpha = cmb.k2.getAlpha();
            cmb.k2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, cmb.k2);
            cmb.k2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, cmb.k2);
            cmb.k2.setAlpha(alpha);
            if (!z) {
                String C = jb6.C(i4 - currentTime);
                canvas.drawText(C, rectF.centerX() - (cmb.E2.measureText(C) / 2.0f), gm.L(textView != null ? 37.0f : 31.0f), cmb.E2);
                return;
            }
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (cmb.E2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = cmb.E2.getColor();
                this.N = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.M.setBounds(aq1.A(2, (int) rectF.centerX(), this.M), aq1.y(2, (int) rectF.centerY(), this.M), aq1.w(2, (int) rectF.centerX(), this.M), aq1.i(2, (int) rectF.centerY(), this.M));
            this.M.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-gm.L(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(cd6 cd6Var) {
        this.w = cd6Var;
        this.F = cd6Var.e;
        bf0 bf0Var = this.c;
        bf0Var.getImageReceiver().d = this.F;
        boolean D = pg3.D(cd6Var.a);
        int i = this.F;
        lka lkaVar = this.d;
        if (D) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(cd6Var.a));
            if (W1 != null) {
                this.n.q(W1);
                lkaVar.l(bw2.m(0, W1.first_name, W1.last_name), false);
                bf0Var.f(W1, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-cd6Var.a));
        if (L0 != null) {
            this.n.p(L0);
            lkaVar.l(L0.title, false);
            bf0Var.f(L0, this.n);
        }
    }

    @Override // vlb
    public final void updateColors() {
        int v0;
        try {
            if (this.a == null || (v0 = cmb.v0(cmb.jj, this.E)) == this.b) {
                return;
            }
            this.b = v0;
            cmb.F1(this.a, v0, false);
            cmb.F1(this.a, v0, true);
            this.a.invalidateSelf();
            bf0 bf0Var = this.c;
            if (bf0Var != null) {
                bf0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
