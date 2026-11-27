// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lfc {
    public final ua8 a;
    public r7b b;
    public String c;
    public boolean d;
    public gd4 e;
    public ox7 f;
    public ArrayList g;
    public o7b h;
    public boolean i;
    public final bva j = new bva(this, (byte) 10);

    public lfc(ua8 ua8Var) {
        this.a = ua8Var;
    }

    public final void a(int i, p7b p7bVar) {
        r7b r7bVar;
        pm3 pm3Var;
        p7b p7bVar2 = (p7bVar == null || (DictationAsr.x(i) && qn3.h())) ? p7bVar : null;
        String g = p7bVar2 == null ? null : p7bVar2.g();
        if (TextUtils.equals(g, this.c)) {
            return;
        }
        c();
        r7b r7bVar2 = this.b;
        if (r7bVar2 != null) {
            r7bVar2.c();
            this.b = null;
        }
        this.c = g;
        if (p7bVar2 != null) {
            r7b r7bVar3 = new r7b(p7bVar2, 0L, 0L, new c9c(this, r9, (byte) 15));
            this.b = r7bVar3;
            r7b[] r7bVarArr = {r7bVar3};
            if (r7bVar3.f != null && uc7.e1().getBoolean("asr_video_captions", false) && (pm3Var = (r7bVar = this.b).f) != null && (DictationAsr.B((nm3) pm3Var.b) || DictationAsr.z((nm3) r7bVar.f.b))) {
                b();
            }
        }
        this.a.a();
    }

    public final void b() {
        r7b r7bVar;
        ua8 ua8Var = this.a;
        PhotoViewer photoViewer = ua8Var.a;
        if (this.d || (r7bVar = this.b) == null || r7bVar.f == null) {
            return;
        }
        this.d = true;
        ox7 ox7Var = this.f;
        if (ox7Var == null) {
            ox7 ox7Var2 = new ox7(photoViewer.f0.getContext(), (byte) 1);
            this.f = ox7Var2;
            ox7Var2.setEnabled(false);
            this.f.setFocusable(false);
            this.f.setClickable(false);
            this.f.setBackgroundColor(0);
            this.f.setTextSize(1, 16.0f);
            this.f.setTypeface(hl.o());
            this.f.setGravity(17);
            this.f.setTextAlignment(4);
            this.f.setHorizontallyScrolling(false);
            this.f.setMaxLines(3);
            this.f.setBreakStrategy(0);
            this.f.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
            this.f.setFrameColor(2130706432);
            this.f.setTextColor(-1);
            this.f.setTallFrame(true);
            this.f.setAlpha(0.0f);
            this.f.setImportantForAccessibility(2);
            ad8 ad8Var = photoViewer.f0;
            ox7 ox7Var3 = this.f;
            kd8 kd8Var = photoViewer.i3;
            ad8Var.addView(ox7Var3, kd8Var != null ? ad8Var.indexOfChild(kd8Var) : -1, tre.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
        } else if (ox7Var.getParent() == null) {
            ad8 ad8Var2 = photoViewer.f0;
            ox7 ox7Var4 = this.f;
            kd8 kd8Var2 = photoViewer.i3;
            ad8Var2.addView(ox7Var4, kd8Var2 != null ? ad8Var2.indexOfChild(kd8Var2) : -1, tre.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
        }
        r7b r7bVar2 = this.b;
        r7bVar2.n = new ftb(ua8Var, (byte) 10);
        r7bVar2.d = 1;
        TextPaint textPaint = new TextPaint(this.f.getPaint());
        float width = (((photoViewer.f0.getWidth() > 0 ? photoViewer.f0.getWidth() : hl.q.x) - hl.L(32.0f)) - this.f.getPaddingLeft()) - this.f.getPaddingRight();
        r7bVar2.u = new ec1(textPaint, (byte) 1);
        r7bVar2.v = width * 0.96f;
        Context context = this.f.getContext();
        ad8 ad8Var3 = photoViewer.f0;
        vnb vnbVar = photoViewer.w2;
        pm3 pm3Var = r7bVar2.f;
        gd4 gd4Var = new gd4(context, ad8Var3, vnbVar, pm3Var == null ? "" : bn3.t(pm3Var.t()), new c9c(this, r7bVar2, (byte) 16));
        this.e = gd4Var;
        r7bVar2.h(0L, 0L, new ko9(this, gd4Var, r7bVar2));
        ox7 ox7Var5 = this.f;
        bva bvaVar = this.j;
        ox7Var5.removeCallbacks(bvaVar);
        this.f.postOnAnimation(bvaVar);
    }

    public final void c() {
        r7b r7bVar = this.b;
        if (r7bVar != null) {
            r7bVar.i();
        }
        gd4 gd4Var = this.e;
        if (gd4Var != null) {
            gd4Var.f = null;
            v21 v21Var = (v21) gd4Var.g;
            if (v21Var != null) {
                v21Var.b();
                gd4Var.g = null;
            }
            this.e = null;
        }
        this.d = false;
        this.g = null;
        this.h = null;
        ox7 ox7Var = this.f;
        if (ox7Var != null) {
            ox7Var.removeCallbacks(this.j);
            this.f.animate().cancel();
            this.f.setAlpha(0.0f);
            this.i = false;
        }
    }

    public final void d() {
        r7b r7bVar = this.b;
        if (r7bVar == null || r7bVar.f == null) {
            return;
        }
        if (this.d) {
            uc7.e1().edit().putBoolean("asr_video_captions", false).apply();
            c();
        } else {
            uc7.e1().edit().putBoolean("asr_video_captions", true).apply();
            b();
        }
        this.a.a();
    }
}
