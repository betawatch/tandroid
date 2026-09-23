package jh;

import android.content.Context;
import android.widget.FrameLayout;
import b2.n1;
import ci.n4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.xq;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h extends FrameLayout implements le.e {
    public static final int[] s;
    public final String[] a;
    public final d6 b;
    public final dh.a c;
    public final ah.c d;
    public final aa.a[] e;
    public final n1[] f;
    public a h;
    public b n;
    public int r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public h(Context context, d6 d6Var, dh.b bVar, ah.c cVar) {
        super(context);
        this.a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new aa.a[7];
        this.f = new n1[7];
        this.r = 83;
        this.d = cVar;
        this.c = bVar;
        this.b = d6Var;
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            aa.a[] aVarArr = this.e;
            if (i11 >= aVarArr.length || aVarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
    }

    public final void a() {
        int i10 = 0;
        float f7 = 0.0f;
        while (true) {
            aa.a[] aVarArr = this.e;
            if (i10 >= aVarArr.length) {
                return;
            }
            aa.a aVar = aVarArr[i10];
            if (aVar != null) {
                ih.b bVar = (ih.b) aVar.b;
                float f10 = ((le.c) aVar.c).e;
                float f11 = ((le.c) aVar.d).e;
                bVar.setVisibility(f10 > 0.0f ? 0 : 8);
                bVar.setAlpha(f10);
                bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                if (i10 != 0) {
                    bVar.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(80.0f)) - f7);
                }
                f7 += (AndroidUtilities.dp((f11 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f10;
            }
            i10++;
        }
    }

    public final n1 b(int i10) {
        n1[] n1VarArr = this.f;
        if (n1VarArr[i10] == null) {
            n1 n1Var = new n1();
            n1Var.a = 0;
            n1Var.b = false;
            n1Var.c = true;
            n1VarArr[i10] = n1Var;
        }
        return n1VarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        b(i10).a = i11;
        aa.a aVar = this.e[i10];
        if (aVar != null) {
            ((ih.b) aVar.b).a(i11, z10);
            ((le.c) aVar.d).a(i11 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        aa.a aVar = this.e[1];
        if (aVar != null) {
            ((ih.b) aVar.b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        aa.a[] aVarArr = this.e;
        aa.a aVar = aVarArr[i10];
        if (aVar != null || z10) {
            if (aVar == null) {
                int i13 = i10 << 16;
                le.c cVar = new le.c(i13 | 1, this, i10 == 0 ? rr.h : ke.a.a, i10 == 0 ? 300L : 280L, false);
                le.c cVar2 = new le.c(i13 | 2, this, i10 == 0 ? rr.h : ke.a.a, i10 == 0 ? 300L : 280L, false);
                if (i10 == 0) {
                    i11 = 50;
                    i12 = 32;
                } else {
                    i11 = 56;
                    i12 = 48;
                }
                Context context = getContext();
                int i14 = s[i10];
                d6 d6Var = this.b;
                ih.b bVar = new ih.b(context, d6Var);
                ih.a d = ih.a.d(context, this.d, this.c, d6Var, i14, i12);
                bVar.b = d;
                bVar.addView(d, x5.e(i11, i11, 80));
                d.setIconPadding(AndroidUtilities.dp(2.0f));
                z5.b(bVar, 0.13f, 2.0f);
                float f7 = i11 / 2.0f;
                bVar.setPivotX(AndroidUtilities.dp(f7));
                bVar.setPivotY(AndroidUtilities.dp(f7 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.a[i10]);
                bVar.setOnClickListener(new n4(this, i10, 4));
                bVar.setOnLongClickListener(new g(this, i10, 0));
                if (i10 == 6) {
                    ih.a aVar2 = bVar.b;
                    aVar2.h = -1.0f;
                    aVar2.a();
                }
                if (i10 == 1) {
                    bVar.d = true;
                    xq xqVar = bVar.c;
                    if (xqVar != null) {
                        xqVar.setReverse(true);
                    }
                }
                addView(bVar, x5.e(i11, i11 + 8, this.r));
                aVarArr[i10] = new aa.a(bVar, cVar, cVar2, false, 24);
                n1 n1Var = this.f[i10];
                if (n1Var != null) {
                    bVar.a(n1Var.a, false);
                    cVar.a(false, false);
                    cVar2.a(n1Var.a > 0, false);
                    bVar.c(n1Var.b, false);
                    bVar.b(n1Var.c, false);
                }
                a();
            }
            ((le.c) aVarArr[i10].c).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.n = bVar;
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
