// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class l33 extends FrameLayout {
    public boolean E;
    public final hbb a;
    public final mm b;
    public final mm c;
    public final k33 d;
    public final FrameLayout e;
    public final i33 f;
    public final t33 h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final u33 x;
    public c8b y;

    public l33(Context context, hbb hbbVar) {
        super(context);
        this.r = 0.0f;
        final byte b = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new u33();
        this.a = hbbVar;
        k33 k33Var = new k33(this, context);
        this.d = k33Var;
        k43 k43Var = k43.h;
        this.b = new mm(k33Var, 0L, 320L, k43Var);
        this.c = new mm(this, 0L, 360L, k43Var);
        final byte b2 = 0;
        i33 i33Var = new i33(this, context, b2);
        this.f = i33Var;
        i33Var.setListener(new z8d((Object) this, (byte) 23));
        addView(i33Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, tre.e(-1, -1, jn7.D1));
        t33 t33Var = new t33(context);
        this.h = t33Var;
        t33Var.setListener(new j33(this, b2));
        frameLayout.addView(t33Var, tre.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, tre.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final byte b3 = 1;
        bs2.t(textView, 1, 14.0f);
        textView.setBackground(aob.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131752570, null));
        textView.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        frameLayout2.addView(textView, tre.e(-2, -1, jn7.z1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: h33
            public final /* synthetic */ l33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                l33 l33Var = this.b;
                switch (b4) {
                    case 0:
                        ((dbb) l33Var).F.k0(-1, false, true);
                        break;
                    case 1:
                        l33Var.f.l(true);
                        t33 t33Var2 = l33Var.h;
                        t33Var2.setRotated(false);
                        t33Var2.setMirrored(false);
                        t33Var2.b(0.0f);
                        l33Var.d.invalidate();
                        break;
                    default:
                        c8b c8bVar = l33Var.y;
                        if (c8bVar != null) {
                            c8bVar.m0 = new fo6();
                            l33Var.f.a(l33Var.y.m0);
                            c8b c8bVar2 = l33Var.y;
                            c8bVar2.m0.z = c8bVar2.Q;
                        }
                        ((dbb) l33Var).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setBackground(aob.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(ob6.M0(2131751661, null));
        textView2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        frameLayout2.addView(textView2, tre.e(-2, -1, jn7.x1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: h33
            public final /* synthetic */ l33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                l33 l33Var = this.b;
                switch (b4) {
                    case 0:
                        ((dbb) l33Var).F.k0(-1, false, true);
                        break;
                    case 1:
                        l33Var.f.l(true);
                        t33 t33Var2 = l33Var.h;
                        t33Var2.setRotated(false);
                        t33Var2.setMirrored(false);
                        t33Var2.b(0.0f);
                        l33Var.d.invalidate();
                        break;
                    default:
                        c8b c8bVar = l33Var.y;
                        if (c8bVar != null) {
                            c8bVar.m0 = new fo6();
                            l33Var.f.a(l33Var.y.m0);
                            c8b c8bVar2 = l33Var.y;
                            c8bVar2.m0.z = c8bVar2.Q;
                        }
                        ((dbb) l33Var).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(hl.o());
        textView3.setBackground(aob.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(ob6.M0(2131744342, null));
        textView3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        frameLayout2.addView(textView3, tre.e(-2, -1, jn7.B1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: h33
            public final /* synthetic */ l33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                l33 l33Var = this.b;
                switch (b4) {
                    case 0:
                        ((dbb) l33Var).F.k0(-1, false, true);
                        break;
                    case 1:
                        l33Var.f.l(true);
                        t33 t33Var2 = l33Var.h;
                        t33Var2.setRotated(false);
                        t33Var2.setMirrored(false);
                        t33Var2.b(0.0f);
                        l33Var.d.invalidate();
                        break;
                    default:
                        c8b c8bVar = l33Var.y;
                        if (c8bVar != null) {
                            c8bVar.m0 = new fo6();
                            l33Var.f.a(l33Var.y.m0);
                            c8b c8bVar2 = l33Var.y;
                            c8bVar2.m0.z = c8bVar2.Q;
                        }
                        ((dbb) l33Var).F.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        c8b c8bVar = this.y;
        if (c8bVar == null) {
            return 1;
        }
        int i = c8bVar.Q;
        hbb hbbVar = this.a;
        return (i == 90 || i == 270) ? hbbVar.getContentWidth() : hbbVar.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        c8b c8bVar = this.y;
        if (c8bVar == null) {
            return 1;
        }
        int i = c8bVar.Q;
        hbb hbbVar = this.a;
        return (i == 90 || i == 270) ? hbbVar.getContentHeight() : hbbVar.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.setBottomPadding(hl.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.r - f) < 0.001f) {
            return;
        }
        this.r = f;
        k33 k33Var = this.d;
        k33Var.setAlpha(f);
        k33Var.invalidate();
        i33 i33Var = this.f;
        CropAreaView cropAreaView = i33Var.a;
        CropAreaView cropAreaView2 = i33Var.a;
        cropAreaView.setDimAlpha(0.5f * f);
        cropAreaView2.setFrameAlpha(f);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(c8b c8bVar) {
        if (c8bVar == null) {
            return;
        }
        this.y = c8bVar;
        this.E = false;
        i33 i33Var = this.f;
        i33Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        hbb hbbVar = this.a;
        hbbVar.getLocationOnScreen(iArr);
        fo6 fo6Var = c8bVar.m0;
        if (fo6Var == null) {
            fo6Var = null;
        }
        i33Var.p(c8bVar.Q, this.x, fo6Var);
        float rotation = i33Var.getRotation();
        t33 t33Var = this.h;
        t33Var.setRotation(rotation);
        mm mmVar = this.b;
        if (fo6Var != null) {
            t33Var.b(fo6Var.d);
            t33Var.setRotated(fo6Var.k != 0);
            t33Var.setMirrored(fo6Var.l);
            mmVar.f(fo6Var.l, false);
        } else {
            t33Var.b(0.0f);
            t33Var.setRotated(false);
            t33Var.setMirrored(false);
            mmVar.getClass();
            mmVar.e(false, 0.0f);
        }
        i33Var.r(false);
        this.c.e(true, r5.i);
        k33 k33Var = this.d;
        k33Var.setVisibility(0);
        k33Var.invalidate();
        hbbVar.setCropEditorDrawing(this);
    }
}
