package kh;

import af.l;
import ai.n1;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fr;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements ne.d {
    public static final int[] s;
    public final String[] a;
    public final g6 b;
    public final eh.a c;
    public final bh.b d;
    public final androidx.biometric.e[] e;
    public final l[] f;
    public a h;
    public b n;
    public int r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public h(Context context, g6 g6Var, eh.b bVar, bh.b bVar2) {
        super(context);
        this.a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new androidx.biometric.e[7];
        this.f = new l[7];
        this.r = 83;
        this.d = bVar2;
        this.c = bVar;
        this.b = g6Var;
    }

    public final void a() {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            androidx.biometric.e[] eVarArr = this.e;
            if (i10 >= eVarArr.length) {
                return;
            }
            androidx.biometric.e eVar = eVarArr[i10];
            if (eVar != null) {
                jh.b bVar = (jh.b) eVar.b;
                float f10 = ((ne.b) eVar.c).e;
                float f11 = ((ne.b) eVar.d).e;
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

    public final l b(int i10) {
        l[] lVarArr = this.f;
        if (lVarArr[i10] == null) {
            l lVar = new l();
            lVar.a = 0;
            lVar.b = false;
            lVar.c = true;
            lVarArr[i10] = lVar;
        }
        return lVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        b(i10).a = i11;
        androidx.biometric.e eVar = this.e[i10];
        if (eVar != null) {
            ((jh.b) eVar.b).a(i11, z10);
            ((ne.b) eVar.d).a(i11 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        androidx.biometric.e eVar = this.e[1];
        if (eVar != null) {
            ((jh.b) eVar.b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        androidx.biometric.e[] eVarArr = this.e;
        androidx.biometric.e eVar = eVarArr[i10];
        if (eVar != null || z10) {
            if (eVar == null) {
                int i13 = i10 << 16;
                ne.b bVar = new ne.b(i13 | 1, this, i10 == 0 ? bs.h : me.a.a, i10 == 0 ? 300L : 280L, false);
                ne.b bVar2 = new ne.b(i13 | 2, this, i10 == 0 ? bs.h : me.a.a, i10 == 0 ? 300L : 280L, false);
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
                g6 g6Var = this.b;
                jh.b bVar3 = new jh.b(context, g6Var);
                jh.a d = jh.a.d(context, this.d, this.c, g6Var, i15, i14);
                bVar3.b = d;
                bVar3.addView(d, z5.e(i11, i11, 80));
                d.setIconPadding(AndroidUtilities.dp(2.0f));
                b6.b(bVar3, 0.13f, 2.0f);
                float f7 = i11 / 2.0f;
                bVar3.setPivotX(AndroidUtilities.dp(f7));
                bVar3.setPivotY(AndroidUtilities.dp(f7 + 8.0f));
                bVar3.setVisibility(8);
                bVar3.setContentDescription(this.a[i10]);
                bVar3.setOnClickListener(new n1(this, i10, 5));
                bVar3.setOnLongClickListener(new g(this, i10, 0));
                if (i10 == 6) {
                    jh.a aVar = bVar3.b;
                    aVar.h = -1.0f;
                    aVar.a();
                }
                if (i10 == 1) {
                    bVar3.d = true;
                    fr frVar = bVar3.c;
                    if (frVar != null) {
                        frVar.setReverse(true);
                    }
                }
                addView(bVar3, z5.e(i11, i11 + 8, this.r));
                eVarArr[i10] = new androidx.biometric.e(bVar3, bVar, bVar2, 27);
                l lVar = this.f[i10];
                if (lVar != null) {
                    bVar3.a(lVar.a, false);
                    bVar.a(false, false);
                    bVar2.a(lVar.a > 0, false);
                    bVar3.c(lVar.b, false);
                    bVar3.b(lVar.c, false);
                }
                a();
            }
            ((ne.b) eVarArr[i10].c).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            androidx.biometric.e[] eVarArr = this.e;
            if (i11 >= eVarArr.length || eVarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
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

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
