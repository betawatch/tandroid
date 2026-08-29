package nh;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.gg;
import org.telegram.ui.vf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                t5 t5Var = (t5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                c5 c5Var = (c5) this.d;
                Integer num = (Integer) obj;
                n5 n5Var = t5Var.N0;
                h5 h5Var = t5Var.C1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    t5Var.L0(null, new th.n2(t5Var, 1));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    ec.a(true, new ih.b1(11, t5Var, c5Var));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    c5Var.dismiss();
                    gb gbVar = ((ja) t5Var).w2;
                    gbVar.Y0.H.b(true);
                    gbVar.w();
                    gbVar.t(true);
                    gbVar.f(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    g7 g7Var = new g7(t5Var.getContext(), false, null, new b0(t5Var, 4), new lh.b());
                    g7Var.setOnDismissListener(new p4(t5Var, 2));
                    g7Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    t5Var.h2 = true;
                    t5Var.d0(t5Var.l0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!UserConfig.getInstance(t5Var.B1).isPremium()) {
                    try {
                        c5Var.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new tc(c5Var.container, h5Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new p4(t5Var, 1))).k(true);
                    return Boolean.FALSE;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < n5Var.getChildCount(); i11++) {
                    if (n5Var.getChildAt(i11) instanceof bg.k1) {
                        i10++;
                    }
                }
                if (i10 >= 3) {
                    new tc(c5Var.container, h5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                t5Var.K0(null);
                c5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) this.b;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                j70 F = j70.F(g0Var.container, c6Var, e0Var);
                F.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var)));
                final int i12 = 0;
                F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                g0 g0Var2 = g0Var;
                                a0 a0Var = new a0(g0Var2.getContext(), c6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                a0Var.f0 = tL_aiComposeTone2;
                                a0Var.d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                a0Var.X();
                                a0Var.W.setText(a0Var.f0.title);
                                a0Var.X.setText(a0Var.f0.prompt);
                                a0Var.Z.a(a0Var.f0.author_id != 0, false);
                                a0Var.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                a0Var.c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                a0Var.W();
                                a0Var.i0.N(false);
                                a0Var.h0 = new e(g0Var2, 2);
                                a0Var.show();
                                break;
                            default:
                                g0 g0Var3 = g0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g0Var3.getContext(), 0, c6Var);
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kg.w(27, g0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new gg(g0Var, tL_aiComposeTone, context, c6Var, 8), false);
                F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new vf(28, g0Var, tL_aiComposeTone));
                final int i13 = 1;
                F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                g0 g0Var2 = g0Var;
                                a0 a0Var = new a0(g0Var2.getContext(), c6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                a0Var.f0 = tL_aiComposeTone2;
                                a0Var.d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                a0Var.X();
                                a0Var.W.setText(a0Var.f0.title);
                                a0Var.X.setText(a0Var.f0.prompt);
                                a0Var.Z.a(a0Var.f0.author_id != 0, false);
                                a0Var.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                a0Var.c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                a0Var.W();
                                a0Var.i0.N(false);
                                a0Var.h0 = new e(g0Var2, 2);
                                a0Var.show();
                                break;
                            default:
                                g0 g0Var3 = g0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g0Var3.getContext(), 0, c6Var);
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kg.w(27, g0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                });
                F.Z();
                return Boolean.TRUE;
            case 2:
                String str = (String) this.b;
                String str2 = (String) this.c;
                MessageObject messageObject = ((ch.h) this.d).b;
                return ch.c.d((View) obj, str, str2, messageObject.getDocument(), messageObject);
            default:
                jl0 jl0Var = (jl0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != jl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean booleanValue = bool.booleanValue();
                    f2.n1 T = jl0Var.T(view);
                    if (T != null) {
                        sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
