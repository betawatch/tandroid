package ci;

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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.wh;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                r6 r6Var = (r6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                z5 z5Var = (z5) this.d;
                Integer num = (Integer) obj;
                k6 k6Var = r6Var.R0;
                e6 e6Var = r6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    r6Var.L0(null, new bi.v(r6Var, 5));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    od.a(true, new m2(2, r6Var, z5Var));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    z5Var.dismiss();
                    oc ocVar = ((qb) r6Var).A2;
                    ocVar.c1.L.b(true);
                    ocVar.w();
                    ocVar.t(true);
                    ocVar.f(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    g8 g8Var = new g8(r6Var.getContext(), false, null, new ai.y1(r6Var, 10), new ai.d());
                    g8Var.setOnDismissListener(new g5(r6Var, 2));
                    g8Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    r6Var.l2 = true;
                    r6Var.d0(r6Var.l0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!UserConfig.getInstance(r6Var.F1).isPremium()) {
                    try {
                        z5Var.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new org.telegram.ui.Components.vc(z5Var.container, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new g5(r6Var, 1))).k(true);
                    return Boolean.FALSE;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
                    if (k6Var.getChildAt(i11) instanceof qg.t0) {
                        i10++;
                    }
                }
                if (i10 >= 3) {
                    new org.telegram.ui.Components.vc(z5Var.container, e6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                r6Var.K0(null);
                z5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                n70 F = n70.F(e0Var.container, f6Var, c0Var);
                F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
                final int i12 = 0;
                F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), f6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                yVar.j0 = tL_aiComposeTone2;
                                yVar.h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                yVar.X();
                                yVar.a0.setText(yVar.j0.title);
                                yVar.b0.setText(yVar.j0.prompt);
                                yVar.d0.a(yVar.j0.author_id != 0, false);
                                yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                yVar.g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                yVar.W();
                                yVar.m0.N(false);
                                yVar.l0 = new e(e0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, f6Var);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.x5(17, e0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.o5(e0Var, tL_aiComposeTone, context, f6Var, 15), false);
                F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new wh(19, e0Var, tL_aiComposeTone));
                final int i13 = 1;
                F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), f6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                yVar.j0 = tL_aiComposeTone2;
                                yVar.h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                yVar.X();
                                yVar.a0.setText(yVar.j0.title);
                                yVar.b0.setText(yVar.j0.prompt);
                                yVar.d0.a(yVar.j0.author_id != 0, false);
                                yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                yVar.g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                yVar.W();
                                yVar.m0.N(false);
                                yVar.l0 = new e(e0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, f6Var);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.x5(17, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((rh.g) this.d).b;
                return rh.c.d((View) obj, str, str2, messageObject.getDocument(), messageObject);
            default:
                ml0 ml0Var = (ml0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != ml0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 U = ml0Var.U(view);
                    if (U != null) {
                        sparseIntArray.put(U.f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
