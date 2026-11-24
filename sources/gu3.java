// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class gu3 extends FrameLayout implements vlb {
    public boolean E;
    public boolean a;
    public final du3 b;
    public final ylb c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final km w;
    public int x;
    public final ho y;

    /* JADX WARN: Multi-variable type inference failed */
    public gu3(Context context, ela elaVar, String str, boolean z, int i, ylb ylbVar) {
        super(context);
        this.f = -1;
        this.r = true;
        Object[] objArr = 0;
        ho hoVar = new ho(false, true, true);
        this.y = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        this.d = i;
        du3 du3Var = new du3(this, context, elaVar, ylbVar, z);
        this.b = du3Var;
        qu3 editText = du3Var.getEditText();
        editText.setDelegate(new lx6(this, editText, false, (byte) 23));
        du3Var.setWillNotDraw(false);
        this.w = new km(du3Var);
        hoVar.setCallback(du3Var);
        editText.setTextSize(1, 17.0f);
        anb.D(editText, cmb.G6, ylbVar);
        int i2 = cmb.F6;
        anb.X(editText, i2, ylbVar);
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), gm.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((jb6.a0 ? 5 : 3) | 48);
        editText.setInputType((z ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        anb.l(editText, 30, i2, ylbVar);
        this.c = ylbVar;
        editText.setCursorSize(gm.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new eu3(this, i, editText, z));
        editText.setOnFocusChangeListener(new fu3(this, objArr == true ? 1 : 0));
        addView(du3Var, qoe.e(-1, -1, 48));
        c();
    }

    public int a() {
        return vm.f();
    }

    public final void c() {
        int i;
        du3 du3Var = this.b;
        if (du3Var == null || du3Var.getEditText() == null) {
            return;
        }
        this.x = this.d - getText().length();
        this.y.t(((!TextUtils.isEmpty(getText()) || this.e) && (!this.h || this.n) && ((i = this.f) == -1 || this.x <= i)) ? String.valueOf(this.x) : "", true, true);
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(22.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z);
    }

    public void setEmojiViewCacheType(int i) {
        this.b.setEmojiViewCacheType(i);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.h = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.e = z;
        if (z) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.f = i;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        du3 du3Var = this.b;
        du3Var.setText(charSequence);
        du3Var.setSelection(du3Var.getText().length());
        this.a = false;
    }

    @Override // vlb
    public final void updateColors() {
        du3 du3Var = this.b;
        if (du3Var != null) {
            try {
                if (du3Var.getEditText() != null) {
                    du3Var.getEditText().setCursorColor(cmb.v0(cmb.F6, this.c));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
