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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                Context context = (Context) this.d;
                d0 d0Var = (d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    p70 F = p70.F(f0Var.container, f6Var, d0Var);
                    F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
                    final int i10 = 0;
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), f6Var);
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
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mg.w(26, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    break;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.kh(f0Var, tL_aiComposeTone, context, f6Var, 6), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new org.telegram.ui.np(6, f0Var, tL_aiComposeTone));
                    final int i11 = 1;
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() { // from class: org.telegram.ui.Components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), f6Var);
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
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mg.w(26, f0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((eh.h) this.d).b;
                break;
            case 2:
                rl0 rl0Var = (rl0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != rl0Var) {
                        break;
                    } else {
                        Boolean bool = (Boolean) callbackReturn.run(view);
                        boolean booleanValue = bool.booleanValue();
                        f2.l1 T = rl0Var.T(view);
                        if (T != null) {
                            sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                        }
                        break;
                    }
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                ph.c5 c5Var = (ph.c5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ph.l4 l4Var = (ph.l4) this.d;
                Integer num = (Integer) obj;
                ph.w4 w4Var = c5Var.O0;
                ph.q4 q4Var = c5Var.D1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    c5Var.L0(null, new ph.d4(c5Var, 0));
                    break;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    ph.ab.a(true, new ph.s1(2, c5Var, l4Var));
                    break;
                } else if (num.intValue() == 2) {
                    l4Var.dismiss();
                    ph.da daVar = ((ph.h9) c5Var).x2;
                    daVar.Z0.I.b(true);
                    daVar.w();
                    daVar.t(true);
                    daVar.f(true);
                    break;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    ph.l6 l6Var = new ph.l6(c5Var.getContext(), false, null, new org.telegram.ui.web.a1(c5Var, 8), new nh.b());
                    l6Var.setOnDismissListener(new ph.a4(c5Var, 2));
                    l6Var.show();
                    break;
                } else if (num.intValue() == 3) {
                    c5Var.i2 = true;
                    c5Var.d0(c5Var.l0(true));
                    break;
                } else if (num.intValue() == 4) {
                    if (UserConfig.getInstance(c5Var.C1).isPremium()) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < w4Var.getChildCount(); i13++) {
                            if (w4Var.getChildAt(i13) instanceof dg.i1) {
                                i12++;
                            }
                        }
                        if (i12 >= 3) {
                            new qc(l4Var.container, q4Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                            break;
                        } else {
                            zArr[0] = false;
                            c5Var.K0(null);
                            l4Var.dismiss();
                            break;
                        }
                    } else {
                        try {
                            l4Var.container.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                        new qc(l4Var.container, q4Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new ph.a4(c5Var, 1))).k(true);
                        break;
                    }
                } else {
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
