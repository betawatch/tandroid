// default package

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kd1 extends xjb {
    public final ArrayList D0;
    public s5b E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public id1 J0;
    public hd1 K0;
    public qac L0;
    public qac M0;
    public final o1 N0;
    public jd1 O0;
    public float P0;

    public kd1(Context context, PointF pointF, int i, oeb oebVar) {
        super(context, pointF, i, "", oebVar, 3);
        this.D0 = new ArrayList();
        this.N0 = new o1(this, (byte) 14);
        this.P0 = -1.0f;
        getEditText().setMaxLines(3);
        getEditText().setTallFrame(true);
        getEditText().addTextChangedListener(new b7(this, (byte) 5));
    }

    public static void v(dv3 dv3Var, int i) {
        if (i != 3) {
            dv3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            float textSize = dv3Var.getTextSize();
            dv3Var.setShadowLayer(Math.max(1.0f, 0.09f * textSize), 0.0f, textSize * 0.025f, TLObject.FLAG_31);
        }
    }

    public float getLineWidth() {
        return (this.I0 - getEditText().getPaddingLeft()) - getEditText().getPaddingRight();
    }

    public ArrayList<s5b> getSegments() {
        return this.D0;
    }

    @Override // xjb
    public float getSelectionWidth() {
        float f = this.P0;
        return f >= 0.0f ? f : super.getSelectionWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1 o1Var = this.N0;
        removeCallbacks(o1Var);
        postOnAnimation(o1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.N0);
        super.onDetachedFromWindow();
    }

    @Override // xjb
    public final void q() {
        if (!this.G0) {
            this.G0 = true;
            getEditText().setSpokenWords(null);
            qac qacVar = this.L0;
            if (qacVar != null) {
                qacVar.a(Boolean.TRUE);
            }
        }
        super.q();
    }

    @Override // xjb
    public final void r() {
        super.r();
        if (this.G0) {
            this.G0 = false;
            qac qacVar = this.L0;
            if (qacVar != null) {
                qacVar.a(Boolean.FALSE);
            }
            z();
        }
    }

    @Override // xjb
    public final void s() {
        super.s();
        if (getEditText() != null) {
            v(getEditText(), getType());
        }
    }

    @Override // xjb
    public void setBaseFontSize(int i) {
        super.setBaseFontSize(i);
        v(getEditText(), getType());
    }

    public void setLoading(boolean z) {
        if (this.F0 == z) {
            return;
        }
        this.F0 = z;
        t();
    }

    @Override // xjb
    public void setMaxWidth(int i) {
        this.I0 = i;
        super.setMaxWidth(i);
    }

    public void setOnEditing(qac qacVar) {
        this.L0 = qacVar;
    }

    public void setOnSeek(qac qacVar) {
        this.M0 = qacVar;
    }

    public void setPendingProvider(hd1 hd1Var) {
        this.K0 = hd1Var;
    }

    public void setPositionProvider(id1 id1Var) {
        this.J0 = id1Var;
    }

    public void setRangeProvider(jd1 jd1Var) {
        this.O0 = jd1Var;
    }

    public void setSegments(ArrayList<s5b> arrayList) {
        ArrayList<s5b> arrayList2 = this.D0;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        s5b s5bVar = this.E0;
        if (s5bVar != null && !arrayList2.contains(s5bVar) && !this.G0) {
            this.E0 = null;
        }
        z();
    }

    public void setSelectionWidth(float f) {
        if (this.P0 == f) {
            return;
        }
        this.P0 = f;
        m();
    }

    @Override // xjb
    public final void t() {
        dv3 editText = getEditText();
        if (editText == null) {
            return;
        }
        if (!this.F0 || editText.getText().length() > 0) {
            editText.setHint((CharSequence) null);
        } else {
            editText.setHint("…");
            editText.setHintTextColor(-1711276033);
        }
    }

    public final void u(long j, long j2, String str, int[] iArr) {
        s5b s5bVar = new s5b();
        s5bVar.a = j;
        s5bVar.b = j2;
        s5bVar.c = str;
        s5bVar.d = iArr;
        s5bVar.e = true;
        this.D0.add(s5bVar);
    }

    public final s5b w(int i) {
        int i2;
        s5b s5bVar = this.E0;
        ArrayList arrayList = this.D0;
        int indexOf = s5bVar == null ? -1 : arrayList.indexOf(s5bVar);
        if (indexOf < 0 || (i2 = indexOf + i) < 0 || i2 >= arrayList.size()) {
            return null;
        }
        s5b s5bVar2 = (s5b) arrayList.get(i2);
        jd1 jd1Var = this.O0;
        if (jd1Var != null) {
            long N = ((gd1) ((k6d) jd1Var).b).a.N();
            long K = ((gd1) ((k6d) this.O0).b).a.K();
            if (s5bVar2.b <= N) {
                return null;
            }
            if (K > N && s5bVar2.a >= K) {
                return null;
            }
        }
        return s5bVar2;
    }

    public final CharSequence x(int i) {
        s5b w = this.G0 ? w(i) : null;
        if (w == null) {
            return null;
        }
        CharSequence charSequence = w.c;
        return charSequence == null ? "" : charSequence;
    }

    public final void y(int i, int i2, ArrayList arrayList) {
        float f;
        float f2;
        float f3;
        kd1 kd1Var = this;
        int i3 = i;
        ArrayList arrayList2 = kd1Var.D0;
        if (arrayList2.isEmpty() || i3 <= 0 || i2 <= 0) {
            return;
        }
        dv3 dv3Var = new dv3(kd1Var.getContext());
        dv3Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i4 = 0;
        dv3Var.setBackgroundColor(0);
        dv3Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        Typeface b = kd1Var.getTypeface() != null ? kd1Var.getTypeface().b() : null;
        if (b != null) {
            dv3Var.setTypeface(b);
        }
        dv3Var.setTextSize(0, kd1Var.getTextSize());
        dv3Var.setBreakStrategy(0);
        if (kd1Var.getType() != 3) {
            dv3Var.setFrameColor(-16777216);
        }
        dv3Var.setHorizontallyScrolling(false);
        dv3Var.setMaxLines(3);
        int i5 = kd1Var.I0;
        if (i5 > 0) {
            dv3Var.setMaxWidth(i5);
        }
        float f4 = 2.0f;
        float width = (kd1Var.getWidth() / 2.0f) + kd1Var.getX();
        float height = (kd1Var.getHeight() / 2.0f) + kd1Var.getY();
        float scaleX = kd1Var.getScaleX();
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            s5b s5bVar = (s5b) arrayList2.get(i6);
            CharSequence charSequence = s5bVar.c;
            String charSequence2 = charSequence == null ? "" : charSequence.toString();
            if (charSequence2.trim().isEmpty()) {
                f = width;
            } else {
                f = width;
                if (s5bVar.b > s5bVar.a) {
                    dv3Var.setText(charSequence2);
                    int i7 = kd1Var.I0;
                    dv3Var.measure(i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_31) : i4, i4);
                    int measuredWidth = dv3Var.getMeasuredWidth() + 1;
                    int measuredHeight = dv3Var.getMeasuredHeight();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        pcc pccVar = new pcc();
                        pccVar.a = (byte) 11;
                        f2 = f4;
                        f3 = height;
                        pccVar.V = s5bVar.a;
                        pccVar.W = s5bVar.b;
                        int[] iArr = s5bVar.d;
                        pccVar.X = iArr == null ? null : (int[]) iArr.clone();
                        pccVar.j = charSequence2;
                        pccVar.b = (byte) kd1Var.getType();
                        pccVar.l = kd1Var.getSwatch().a;
                        pccVar.m = kd1Var.getTextSize();
                        pccVar.n = kd1Var.getTypeface();
                        pccVar.p = kd1Var.getAlign();
                        pccVar.q = measuredWidth;
                        pccVar.r = measuredHeight;
                        float f5 = measuredWidth;
                        float f6 = f5 * scaleX;
                        float f7 = i3;
                        pccVar.f = f6 / f7;
                        float f8 = measuredHeight;
                        float f9 = f8 * scaleX;
                        float f10 = i2;
                        pccVar.g = f9 / f10;
                        pccVar.c = (f - (f6 / f2)) / f7;
                        pccVar.d = (f3 - (f9 / f2)) / f10;
                        pccVar.e = (float) ((-kd1Var.getRotation()) * 0.017453292519943295d);
                        pccVar.y = f / f7;
                        pccVar.z = f3 / f10;
                        pccVar.w = f5 / f7;
                        pccVar.x = f8 / f10;
                        pccVar.v = scaleX;
                        arrayList.add(pccVar);
                        i6++;
                        kd1Var = this;
                        i3 = i;
                        f4 = f2;
                        width = f;
                        height = f3;
                        i4 = 0;
                    }
                }
            }
            f2 = f4;
            f3 = height;
            i6++;
            kd1Var = this;
            i3 = i;
            f4 = f2;
            width = f;
            height = f3;
            i4 = 0;
        }
    }

    public final void z() {
        id1 id1Var;
        s5b s5bVar;
        CharSequence charSequence;
        boolean z;
        if (this.G0 || (id1Var = this.J0) == null || this.s) {
            return;
        }
        long j = id1Var.get();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i >= arrayList.size()) {
                s5bVar = null;
                break;
            }
            s5bVar = (s5b) arrayList.get(i);
            if (j >= s5bVar.a && j < s5bVar.b) {
                break;
            } else {
                i++;
            }
        }
        hd1 hd1Var = this.K0;
        if (hd1Var != null) {
            if (s5bVar == null) {
                v5b v5bVar = (v5b) ((cd1) hd1Var).b;
                if (v5bVar.o && !v5bVar.h && !v5bVar.e(v5b.a(j))) {
                    v5bVar.f();
                    z = true;
                    setLoading(z);
                }
            }
            z = false;
            setLoading(z);
        }
        if (s5bVar == null || (charSequence = s5bVar.c) == null) {
            charSequence = "";
        }
        if (s5bVar != this.E0 || !TextUtils.equals(charSequence, getText())) {
            this.E0 = s5bVar;
            this.H0 = true;
            setText(charSequence);
            this.H0 = false;
        }
        getEditText().setSpokenWords(s5bVar != null ? s5bVar.d : null);
        getEditText().A(j);
    }
}
