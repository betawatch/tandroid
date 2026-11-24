// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class it3 extends FrameLayout implements tjb {
    public boolean E;
    public final wjb a;
    public int b;
    public boolean c;
    public final ht3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final kl w;
    public int x;
    public final gn y;

    public it3(Context context, String str, boolean z, boolean z2, int i, wjb wjbVar) {
        super(context);
        this.h = -1;
        this.w = new kl(this);
        byte b = 1;
        gn gnVar = new gn(false, true, true);
        this.y = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        this.e = i;
        ht3 ht3Var = new ht3(this, context, wjbVar, i, wjbVar, z2);
        this.d = ht3Var;
        gnVar.setCallback(ht3Var);
        ht3Var.setTextSize(1, 17.0f);
        zkb.D(ht3Var, bkb.G6, wjbVar);
        int i2 = bkb.F6;
        zkb.X(ht3Var, i2, wjbVar);
        ht3Var.setBackground(null);
        if (z) {
            ht3Var.setMaxLines(5);
            ht3Var.setSingleLine(false);
        } else {
            ht3Var.setMaxLines(1);
            ht3Var.setSingleLine(true);
        }
        ht3Var.setPadding(gl.L(21.0f), gl.L(15.0f), gl.L((i > 0 ? 42 : 0) + 21), gl.L(15.0f));
        ht3Var.setGravity((k96.a0 ? 5 : 3) | 48);
        ht3Var.setInputType((z ? 131072 : 0) | 573441);
        ht3Var.setRawInputType((z ? 131072 : 0) | 573441);
        ht3Var.setHint(str);
        this.a = wjbVar;
        int v0 = bkb.v0(i2, wjbVar);
        this.b = v0;
        ht3Var.setCursorColor(v0);
        ht3Var.setCursorSize(gl.L(19.0f));
        ht3Var.setCursorWidth(1.5f);
        ht3Var.addTextChangedListener(new fi(this, i, z));
        ht3Var.setOnFocusChangeListener(new vs3(this, b));
        addView(ht3Var, nme.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i;
        if (this.d == null) {
            return;
        }
        this.x = this.e - getText().length();
        this.y.t(((!TextUtils.isEmpty(getText()) || this.f) && (!this.n || (this.s && !this.r)) && ((i = this.h) == -1 || this.x <= i)) ? String.valueOf(this.x) : "", true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = hq6.d0(y6c.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(22.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.n = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.f = z;
        if (z) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.h = i;
        c();
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence h0 = k27.h0(tL_textWithEntities, false);
        ht3 ht3Var = this.d;
        ht3Var.setText(h0);
        ht3Var.setSelection(ht3Var.getText().length());
        this.c = false;
    }

    @Override // tjb
    public final void updateColors() {
        ht3 ht3Var = this.d;
        if (ht3Var != null) {
            try {
                int v0 = bkb.v0(bkb.F6, this.a);
                if (v0 != this.b) {
                    this.b = v0;
                    ht3Var.setCursorColor(v0);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public void a(boolean z) {
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        ht3 ht3Var = this.d;
        ht3Var.setText(charSequence);
        ht3Var.setSelection(ht3Var.getText().length());
        this.c = false;
    }
}
