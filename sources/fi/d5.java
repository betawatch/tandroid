package fi;

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
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.kp;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                n5 n5Var = (n5) this.d;
                Integer num = (Integer) obj;
                y5 y5Var = e6Var.G0;
                s5 s5Var = e6Var.v1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    e6Var.I0(null, new ai.e(e6Var, 19));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    qc.a(true, new ai.n1(10, e6Var, n5Var));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    n5Var.dismiss();
                    sb sbVar = ((ta) e6Var).p2;
                    sbVar.c1.L.b(true);
                    sbVar.v();
                    sbVar.s(true);
                    sbVar.e(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    o7 o7Var = new o7(e6Var.getContext(), false, null, new ai.i(e6Var, 22), new di.b());
                    o7Var.setOnDismissListener(new v4(e6Var, 2));
                    o7Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    e6Var.a2 = true;
                    e6Var.b0(e6Var.i0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!UserConfig.getInstance(e6Var.u1).isPremium()) {
                    try {
                        n5Var.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new wc(n5Var.container, s5Var).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new v4(e6Var, 1))).k(true);
                    return Boolean.FALSE;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < y5Var.getChildCount(); i11++) {
                    if (y5Var.getChildAt(i11) instanceof sg.q0) {
                        i10++;
                    }
                }
                if (i10 >= 3) {
                    new wc(n5Var.container, s5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                e6Var.H0(null);
                n5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                final org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                l80 F = l80.F(e0Var.container, u6Var, c0Var);
                F.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var)));
                final int i12 = 0;
                F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), u6Var);
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
                                yVar.n0.O(false);
                                yVar.l0 = new e(e0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, u6Var);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.s0(27, e0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new m4.v0(e0Var, tL_aiComposeTone, context, u6Var, 22), false);
                F.m(R.drawable.msg_delete, new kp(3, e0Var, tL_aiComposeTone), LocaleController.getString(R.string.AIEditorRemoveStyle), !tL_aiComposeTone.creator, true);
                final int i13 = 1;
                F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.Components.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), u6Var);
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
                                yVar.n0.O(false);
                                yVar.l0 = new e(e0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, u6Var);
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.s0(27, e0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.p();
                                break;
                        }
                    }
                }, LocaleController.getString(R.string.AIEditorDeleteStyle), tL_aiComposeTone.creator, true);
                F.Z();
                return Boolean.TRUE;
            case 2:
                String str = (String) this.b;
                String str2 = (String) this.c;
                MessageObject messageObject = ((th.g) this.d).b;
                return th.c.d((View) obj, str, str2, messageObject.getDocument(), messageObject);
            default:
                nm0 nm0Var = (nm0) this.b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != nm0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean booleanValue = bool.booleanValue();
                    s4.e1 T = nm0Var.T(view);
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
