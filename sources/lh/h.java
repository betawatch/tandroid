package lh;

import ai.w;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements oe.d {
    public static final int[] s;
    public final String[] a;
    public final u6 b;
    public final fh.a c;
    public final ch.b d;
    public final k6.c[] e;
    public final ag.g[] f;
    public a h;
    public b n;
    public int r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public h(Context context, u6 u6Var, fh.b bVar, ch.b bVar2) {
        super(context);
        this.a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new k6.c[7];
        this.f = new ag.g[7];
        this.r = 83;
        this.d = bVar2;
        this.c = bVar;
        this.b = u6Var;
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            k6.c[] cVarArr = this.e;
            if (i11 >= cVarArr.length || cVarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
    }

    public final void a() {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            k6.c[] cVarArr = this.e;
            if (i10 >= cVarArr.length) {
                return;
            }
            k6.c cVar = cVarArr[i10];
            if (cVar != null) {
                kh.b bVar = (kh.b) cVar.b;
                float f10 = ((oe.b) cVar.c).e;
                float f11 = ((oe.b) cVar.d).e;
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

    public final ag.g b(int i10) {
        ag.g[] gVarArr = this.f;
        if (gVarArr[i10] == null) {
            ag.g gVar = new ag.g();
            gVar.a = 0;
            gVar.b = false;
            gVar.c = true;
            gVarArr[i10] = gVar;
        }
        return gVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        b(i10).a = i11;
        k6.c cVar = this.e[i10];
        if (cVar != null) {
            ((kh.b) cVar.b).a(i11, z10);
            ((oe.b) cVar.d).a(i11 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        k6.c cVar = this.e[1];
        if (cVar != null) {
            ((kh.b) cVar.b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        k6.c[] cVarArr = this.e;
        k6.c cVar = cVarArr[i10];
        if (cVar != null || z10) {
            if (cVar == null) {
                int i13 = i10 << 16;
                oe.b bVar = new oe.b(i13 | 1, this, i10 == 0 ? ds.h : ne.a.a, i10 == 0 ? 300L : 280L, false);
                oe.b bVar2 = new oe.b(i13 | 2, this, i10 == 0 ? ds.h : ne.a.a, i10 == 0 ? 300L : 280L, false);
                if (i10 == 0) {
                    i11 = 50;
                    i12 = 32;
                } else {
                    i11 = 56;
                    i12 = 48;
                }
                int i14 = i12;
                Context context = getContext();
                int i15 = s[i10];
                u6 u6Var = this.b;
                kh.b bVar3 = new kh.b(context, u6Var);
                kh.a d = kh.a.d(context, this.d, this.c, u6Var, i15, i14);
                bVar3.b = d;
                bVar3.addView(d, kb1.i(i11, i11, 80));
                d.setIconPadding(AndroidUtilities.dp(2.0f));
                kb1.c(bVar3, 0.13f, 2.0f);
                float f7 = i11 / 2.0f;
                bVar3.setPivotX(AndroidUtilities.dp(f7));
                bVar3.setPivotY(AndroidUtilities.dp(f7 + 8.0f));
                bVar3.setVisibility(8);
                bVar3.setContentDescription(this.a[i10]);
                bVar3.setOnClickListener(new w(this, i10, 6));
                bVar3.setOnLongClickListener(new g(this, i10, 0));
                if (i10 == 6) {
                    kh.a aVar = bVar3.b;
                    aVar.h = -1.0f;
                    aVar.a();
                }
                if (i10 == 1) {
                    bVar3.d = true;
                    hr hrVar = bVar3.c;
                    if (hrVar != null) {
                        hrVar.setReverse(true);
                    }
                }
                addView(bVar3, kb1.i(i11, i11 + 8, this.r));
                cVarArr[i10] = new k6.c(bVar3, bVar, bVar2, 2);
                ag.g gVar = this.f[i10];
                if (gVar != null) {
                    bVar3.a(gVar.a, false);
                    bVar.a(false, false);
                    bVar2.a(gVar.a > 0, false);
                    bVar3.c(gVar.b, false);
                    bVar3.b(gVar.c, false);
                }
                a();
            }
            ((oe.b) cVarArr[i10].c).a(z10, z11);
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

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
