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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hga extends FrameLayout implements tjb {
    public final wjb E;
    public int F;
    public final bg7 G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public ff0 a;
    public int b;
    public final be0 c;
    public final jia d;
    public int e;
    public final TextView f;
    public boolean h;
    public pb0 n;
    public final byte r;
    public final RectF s;
    public db6 w;
    public la6 x;
    public final Location y;

    /* JADX WARN: Multi-variable type inference failed */
    public hga(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        this.s = new RectF();
        this.y = new Location("network");
        this.F = y6c.t0;
        this.G = new bg7(this, (byte) 28);
        this.L = "";
        this.E = wjbVar;
        this.r = i;
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(21.0f));
        this.n = new pb0((wjb) null);
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        kk7.i(jiaVar);
        jiaVar.setTextSize(16);
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setTypeface(gl.o());
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        jiaVar.setScrollNonFitText(true);
        boolean z2 = k96.a0;
        if (z) {
            addView(be0Var, nme.d(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 12.0f, z2 ? 15.0f : 0.0f, 0.0f));
            boolean z3 = k96.a0;
            addView(jiaVar, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? i : 73.0f, 12.0f, z3 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            zkb.X(textView, bkb.z6, wjbVar);
            textView.setGravity(k96.a0 ? 5 : 3);
            boolean z4 = k96.a0;
            addView(textView, nme.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? i : 73.0f, 33.0f, z4 ? 73.0f : i, 0.0f));
        } else {
            addView(be0Var, nme.d(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 6.0f, z2 ? 15.0f : 0.0f, 0.0f));
            boolean z5 = k96.a0;
            addView(jiaVar, nme.d(-2, -2.0f, (z5 ? 5 : 3) | 48, z5 ? i : 74.0f, 17.0f, z5 ? 74.0f : i, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        hga hgaVar;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) > 1.0E-6d || Math.abs(this.J - d2) > 1.0E-6d || TextUtils.isEmpty(this.L)) {
            this.H = true;
            hgaVar = this;
            Utilities.e.c(new gga(hgaVar, d, d2, (byte) 0));
        } else {
            hgaVar = this;
        }
        return hgaVar.L;
    }

    public final void b(k27 k27Var, Location location, boolean z) {
        float f;
        CharSequence charSequence;
        TLRPC.Message message;
        jia jiaVar = this.d;
        be0 be0Var = this.c;
        wjb wjbVar = this.E;
        TextView textView = this.f;
        if (k27Var != null && (message = k27Var.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            zkb.x(this, drawable, bkb.dj, wjbVar, PorterDuff.Mode.MULTIPLY);
            int v0 = bkb.v0(bkb.jj, wjbVar);
            ff0 h0 = bkb.h0(gl.L(42.0f), v0, v0);
            this.a = h0;
            this.b = v0;
            fm2 fm2Var = new fm2(h0, drawable);
            int L = gl.L(42.0f);
            int L2 = gl.L(42.0f);
            fm2Var.h = L;
            fm2Var.n = L2;
            int L3 = gl.L(24.0f);
            int L4 = gl.L(24.0f);
            fm2Var.e = L3;
            fm2Var.f = L4;
            be0Var.setImageDrawable(fm2Var);
            jiaVar.l(b00.e(jiaVar, na7.q1(this.F).y1(cf3.n(k27Var.k.peer_id), false), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = k27Var.k.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), gl.q.x - gl.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = k27Var.Z0();
        if (k27.l3(k27Var.k)) {
            Z0 = k27.B1(k27Var.k.fwd_from.from_id);
        }
        this.F = k27Var.K1;
        String str2 = !TextUtils.isEmpty(k27Var.k.media.address) ? k27Var.k.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(k27Var.k.media.title);
        if (isEmpty) {
            this.n = null;
            f = 42.0f;
            int i = this.F;
            if (Z0 > 0) {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(Z0));
                if (V1 != null) {
                    this.n = new pb0(0, V1);
                    charSequence = l7c.q(V1);
                    be0Var.f(V1, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = k27Var.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-Z0));
                if (K0 != null) {
                    pb0 pb0Var = new pb0(K0);
                    this.n = pb0Var;
                    charSequence = K0.title;
                    be0Var.f(K0, pb0Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = k27Var.k.media.geo;
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
                spannableString.setSpan(new u86(jiaVar, gl.L(100.0f), 0, wjbVar), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(k27Var.k.media.title)) {
                charSequence = k27Var.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            zkb.x(this, drawable2, bkb.dj, wjbVar, PorterDuff.Mode.MULTIPLY);
            int v02 = bkb.v0(bkb.jj, wjbVar);
            ff0 h02 = bkb.h0(gl.L(f), v02, v02);
            this.a = h02;
            this.b = v02;
            fm2 fm2Var2 = new fm2(h02, drawable2);
            int L5 = gl.L(f);
            int L6 = gl.L(f);
            fm2Var2.h = L5;
            fm2Var2.n = L6;
            int L7 = gl.L(24.0f);
            int L8 = gl.L(24.0f);
            fm2Var2.e = L7;
            fm2Var2.f = L8;
            be0Var.setImageDrawable(fm2Var2);
        }
        jiaVar.l(charSequence, false);
        double d = k27Var.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(k27Var.k.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z) {
                textView.setText("");
                return;
            } else {
                textView.setText(k96.M0(2131748587, null));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(k96.y(distanceTo, 0, null));
            return;
        }
        textView.setText(str2 + " - " + k96.y(distanceTo, 0, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl.d3(this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.G);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        db6 db6Var = this.w;
        if (db6Var == null) {
            la6 la6Var = this.x;
            if (la6Var == null) {
                return;
            }
            TLRPC.Message message = la6Var.b;
            int i3 = message.date;
            i2 = message.media.period;
            i = i3 + i2;
        } else {
            i = db6Var.c;
            i2 = db6Var.d;
        }
        int i4 = i;
        boolean z = i2 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.F).getCurrentTime();
        if (i4 >= currentTime || z) {
            float abs = z ? 1.0f : Math.abs(i4 - currentTime) / i2;
            boolean z2 = k96.a0;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z2) {
                rectF.set(gl.L(13.0f), gl.L(textView != null ? 18.0f : 12.0f), gl.L(43.0f), gl.L(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - gl.L(43.0f), gl.L(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - gl.L(13.0f), gl.L(textView == null ? 42.0f : 48.0f));
            }
            wjb wjbVar = this.E;
            int v0 = textView == null ? bkb.v0(bkb.oj, wjbVar) : bkb.v0(bkb.ij, wjbVar);
            bkb.k2.setColor(v0);
            bkb.E2.setColor(v0);
            int alpha = bkb.k2.getAlpha();
            bkb.k2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, bkb.k2);
            bkb.k2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, bkb.k2);
            bkb.k2.setAlpha(alpha);
            if (!z) {
                String C = k96.C(i4 - currentTime);
                canvas.drawText(C, rectF.centerX() - (bkb.E2.measureText(C) / 2.0f), gl.L(textView != null ? 37.0f : 31.0f), bkb.E2);
                return;
            }
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (bkb.E2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = bkb.E2.getColor();
                this.N = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.M.setBounds(oo1.A(2, (int) rectF.centerX(), this.M), oo1.y(2, (int) rectF.centerY(), this.M), oo1.w(2, (int) rectF.centerX(), this.M), oo1.i(2, (int) rectF.centerY(), this.M));
            this.M.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-gl.L(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(db6 db6Var) {
        this.w = db6Var;
        this.F = db6Var.e;
        be0 be0Var = this.c;
        be0Var.getImageReceiver().d = this.F;
        boolean D = cf3.D(db6Var.a);
        int i = this.F;
        jia jiaVar = this.d;
        if (D) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(db6Var.a));
            if (V1 != null) {
                this.n.q(V1);
                jiaVar.l(qu2.m(0, V1.first_name, V1.last_name), false);
                be0Var.f(V1, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-db6Var.a));
        if (K0 != null) {
            this.n.p(K0);
            jiaVar.l(K0.title, false);
            be0Var.f(K0, this.n);
        }
    }

    @Override // tjb
    public final void updateColors() {
        int v0;
        try {
            if (this.a == null || (v0 = bkb.v0(bkb.jj, this.E)) == this.b) {
                return;
            }
            this.b = v0;
            bkb.F1(this.a, v0, false);
            bkb.F1(this.a, v0, true);
            this.a.invalidateSelf();
            be0 be0Var = this.c;
            if (be0Var != null) {
                be0Var.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
