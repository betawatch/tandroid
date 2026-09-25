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
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.fh;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o5(Object obj, Object obj2, Object obj3, int i10) {
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
                y5 y5Var = (y5) this.d;
                Integer num = (Integer) obj;
                j6 j6Var = q6Var.R0;
                d6 d6Var = q6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    q6Var.L0(null, new bi.v(q6Var, 5));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    ld.a(true, new ai.g3(3, q6Var, y5Var));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    y5Var.dismiss();
                    lc lcVar = ((nb) q6Var).A2;
                    lcVar.c1.L.b(true);
                    lcVar.w();
                    lcVar.t(true);
                    lcVar.f(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    d8 d8Var = new d8(q6Var.getContext(), false, null, new ai.y1(q6Var, 12), new ai.d());
                    d8Var.setOnDismissListener(new f5(q6Var, 2));
                    d8Var.show();
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
                        y5Var.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new org.telegram.ui.Components.xc(y5Var.container, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new f5(q6Var, 1))).k(true);
                    return Boolean.FALSE;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
                    if (j6Var.getChildAt(i11) instanceof qg.r0) {
                        i10++;
                    }
                }
                if (i10 >= 3) {
                    new org.telegram.ui.Components.xc(y5Var.container, d6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                q6Var.K0(null);
                y5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                final org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                y70 F = y70.F(e0Var.container, d6Var2, c0Var);
                F.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var2)));
                final int i12 = 0;
                F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), d6Var2);
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
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var2);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.o(20, e0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.l5(e0Var, tL_aiComposeTone, context, d6Var2, 16), false);
                F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new fh(24, e0Var, tL_aiComposeTone));
                final int i13 = 1;
                F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), d6Var2);
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
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var2);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.o(20, e0Var3, tL_aiComposeTone));
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
                wl0 wl0Var = (wl0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != wl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = wl0Var.T(view);
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
