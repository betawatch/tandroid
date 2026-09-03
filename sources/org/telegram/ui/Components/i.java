package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                final f0 f0Var = (f0) this.b;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                Context context = (Context) this.d;
                d0 d0Var = (d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    q70 F = q70.F(f0Var.container, g6Var, d0Var);
                    F.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var)));
                    final int i10 = 0;
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), g6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.g0 = tL_aiComposeTone2;
                                    zVar.e0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.X.setText(zVar.g0.title);
                                    zVar.Y.setText(zVar.g0.prompt);
                                    zVar.a0.a(zVar.g0.author_id != 0, false);
                                    zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.d0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.j0.N(false);
                                    zVar.i0 = new e(f0Var2, 2);
                                    zVar.show();
                                    break;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, g6Var);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ng.w(26, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    break;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ih(f0Var, tL_aiComposeTone, context, g6Var, 6), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new org.telegram.ui.mp(5, f0Var, tL_aiComposeTone));
                    final int i11 = 1;
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() { // from class: org.telegram.ui.Components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), g6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.g0 = tL_aiComposeTone2;
                                    zVar.e0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.X.setText(zVar.g0.title);
                                    zVar.Y.setText(zVar.g0.prompt);
                                    zVar.a0.a(zVar.g0.author_id != 0, false);
                                    zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.d0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.j0.N(false);
                                    zVar.i0 = new e(f0Var2, 2);
                                    zVar.show();
                                    break;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, g6Var);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ng.w(26, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    break;
                            }
                        }
                    });
                    F.Z();
                    break;
                } else {
                    break;
                }
            case 1:
                String str = (String) this.b;
                String str2 = (String) this.c;
                MessageObject messageObject = ((fh.h) this.d).b;
                break;
            case 2:
                sl0 sl0Var = (sl0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != sl0Var) {
                        break;
                    } else {
                        Boolean bool = (Boolean) callbackReturn.run(view);
                        boolean booleanValue = bool.booleanValue();
                        f2.m1 T = sl0Var.T(view);
                        if (T != null) {
                            sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                        }
                        break;
                    }
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                qh.a5 a5Var = (qh.a5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                qh.k4 k4Var = (qh.k4) this.d;
                Integer num = (Integer) obj;
                qh.v4 v4Var = a5Var.O0;
                qh.p4 p4Var = a5Var.D1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    a5Var.L0(null, new qh.c4(a5Var, 0));
                    break;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    qh.xa.a(true, new org.telegram.ui.web.a2(3, a5Var, k4Var));
                    break;
                } else if (num.intValue() == 2) {
                    k4Var.dismiss();
                    qh.ba baVar = ((qh.e9) a5Var).x2;
                    baVar.Z0.I.b(true);
                    baVar.w();
                    baVar.t(true);
                    baVar.f(true);
                    break;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    qh.i6 i6Var = new qh.i6(a5Var.getContext(), false, null, new org.telegram.ui.web.d1(a5Var, 8), new oh.b());
                    i6Var.setOnDismissListener(new qh.z3(a5Var, 2));
                    i6Var.show();
                    break;
                } else if (num.intValue() == 3) {
                    a5Var.i2 = true;
                    a5Var.d0(a5Var.l0(true));
                    break;
                } else if (num.intValue() == 4) {
                    if (UserConfig.getInstance(a5Var.C1).isPremium()) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < v4Var.getChildCount(); i13++) {
                            if (v4Var.getChildAt(i13) instanceof eg.g1) {
                                i12++;
                            }
                        }
                        if (i12 >= 3) {
                            new qc(k4Var.container, p4Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                            break;
                        } else {
                            zArr[0] = false;
                            a5Var.K0(null);
                            k4Var.dismiss();
                            break;
                        }
                    } else {
                        try {
                            k4Var.container.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                        new qc(k4Var.container, p4Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new qh.z3(a5Var, 1))).k(true);
                        break;
                    }
                } else {
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
