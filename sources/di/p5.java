package di;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.fh;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                z5 z5Var = (z5) this.d;
                Integer num = (Integer) obj;
                k6 k6Var = q6Var.R0;
                e6 e6Var = q6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    q6Var.L0(null, new ci.u(q6Var, 5));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    od.a(true, new m2(2, q6Var, z5Var));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    z5Var.dismiss();
                    pc pcVar = ((rb) q6Var).A2;
                    pcVar.c1.L.b(true);
                    pcVar.w();
                    pcVar.t(true);
                    pcVar.f(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    g8 g8Var = new g8(q6Var.getContext(), false, null, new bi.o1(q6Var, 10), new bi.b());
                    g8Var.setOnDismissListener(new g5(q6Var, 2));
                    g8Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    q6Var.l2 = true;
                    q6Var.d0(q6Var.l0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!UserConfig.getInstance(q6Var.F1).isPremium()) {
                    try {
                        z5Var.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new org.telegram.ui.Components.yc(z5Var.container, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new g5(q6Var, 1))).k(true);
                    return Boolean.FALSE;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
                    if (k6Var.getChildAt(i11) instanceof rg.s0) {
                        i10++;
                    }
                }
                if (i10 >= 3) {
                    new org.telegram.ui.Components.yc(z5Var.container, e6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                q6Var.K0(null);
                z5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                n70 F = n70.F(f0Var.container, f6Var, d0Var);
                F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
                final int i12 = 0;
                F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                f0 f0Var2 = f0Var;
                                z zVar = new z(f0Var2.getContext(), f6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                zVar.j0 = tL_aiComposeTone2;
                                zVar.h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                zVar.X();
                                zVar.a0.setText(zVar.j0.title);
                                zVar.b0.setText(zVar.j0.prompt);
                                zVar.d0.a(zVar.j0.author_id != 0, false);
                                zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                zVar.g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                zVar.W();
                                zVar.m0.N(false);
                                zVar.l0 = new e(f0Var2, 2);
                                zVar.show();
                                break;
                            default:
                                f0 f0Var3 = f0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.m4(18, f0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.n5(f0Var, tL_aiComposeTone, context, f6Var, 15), false);
                F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new fh(25, f0Var, tL_aiComposeTone));
                final int i13 = 1;
                F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() { // from class: org.telegram.ui.Components.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                f0 f0Var2 = f0Var;
                                z zVar = new z(f0Var2.getContext(), f6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                zVar.j0 = tL_aiComposeTone2;
                                zVar.h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                zVar.X();
                                zVar.a0.setText(zVar.j0.title);
                                zVar.b0.setText(zVar.j0.prompt);
                                zVar.d0.a(zVar.j0.author_id != 0, false);
                                zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                zVar.g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                zVar.W();
                                zVar.m0.N(false);
                                zVar.l0 = new e(f0Var2, 2);
                                zVar.show();
                                break;
                            default:
                                f0 f0Var3 = f0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.m4(18, f0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((sh.g) this.d).b;
                return sh.c.d((View) obj, str, str2, messageObject.getDocument(), messageObject);
            default:
                ll0 ll0Var = (ll0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != ll0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = ll0Var.T(view);
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
