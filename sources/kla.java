// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.g0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kla implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kla(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e Q;
        TLRPC.Chat chat;
        int i;
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                nla nlaVar = (nla) obj;
                if (!nlaVar.y.f) {
                    if (nlaVar.x.f) {
                        jla jlaVar = nlaVar.a;
                        boolean z = nlaVar.b;
                        d6 d6Var = jlaVar.f0;
                        if (d6Var != null) {
                            d6Var.b(z ? 1 : 0);
                            break;
                        }
                    } else if (nlaVar.c == mla.b) {
                        hl.A3(4.0f, nlaVar, null);
                        break;
                    }
                }
                break;
            case 1:
                ((gra) obj).dismiss();
                break;
            case 2:
                ((nsa) obj).run();
                break;
            case 3:
                ((nsa) obj).run();
                break;
            case 4:
                bua buaVar = (bua) obj;
                new eza(buaVar.b, buaVar.g).show();
                break;
            case 5:
                ((uua) obj).dismiss();
                break;
            case 6:
                ((qxa) obj).run();
                break;
            case 7:
                if (((cza) ((dr0) obj).d).e > 0 && (Q = LaunchActivity.Q()) != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    Q.showAsSheet(new nza(), bg0Var);
                    break;
                }
                break;
            case 8:
                ((g2b) obj).dismiss();
                e Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new xk8(Q2, 14, false));
                    break;
                }
                break;
            case 9:
                ((z2b) obj).b.getImageReceiver().w0(false);
                break;
            case 10:
                hl.d3((ux9) obj, 100L);
                break;
            case 11:
                q3b q3bVar = (q3b) obj;
                TextView textView = q3bVar.F;
                TextView textView2 = q3bVar.E;
                ok8 ok8Var = q3bVar.G;
                if (ok8Var.getVisibility() != 0 || !ok8Var.w.isEnabled()) {
                    if (textView2.getVisibility() == 0 && textView2.isEnabled()) {
                        textView2.performClick();
                        break;
                    } else if (textView.getVisibility() == 0 && textView.isEnabled()) {
                        textView.performClick();
                        break;
                    }
                } else {
                    ok8Var.performClick();
                    break;
                }
                break;
            case 12:
                z4b z4bVar = (z4b) obj;
                LongSparseArray longSparseArray = z4bVar.n;
                h94 h94Var = (h94) view.getParent();
                TLRPC.StickerSetCovered stickerSet = h94Var.getStickerSet();
                if (stickerSet != null && z4bVar.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (h94Var.r) {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        z4bVar.e.a.h(h94Var.getStickerSet());
                        break;
                    } else {
                        z4bVar.F(stickerSet, h94Var);
                        break;
                    }
                }
                break;
            case 13:
                ((k8b) obj).onBackPressed();
                break;
            case 14:
                v8b v8bVar = (v8b) obj;
                v8bVar.onClick(v8bVar.b);
                break;
            case 15:
                i9b i9bVar = (i9b) ((az7) obj).h;
                if (i9bVar != null) {
                    i9bVar.run();
                    break;
                }
                break;
            case 16:
                ubb ubbVar = (ubb) obj;
                ubbVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new ecb(ubbVar, b2)).start();
                break;
            case 17:
                ((shb) obj).dismiss();
                break;
            case 18:
                rob robVar = (rob) obj;
                xea.D0 = !xea.D0;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("compactMode", xea.D0);
                edit.apply();
                aob.j(false, false);
                robVar.c.setChecked(xea.D0);
                sqb sqbVar = robVar.a;
                for (wb2 wb2Var : sqbVar.getCells()) {
                    wb2Var.getMessageObject().S1 = false;
                    wb2Var.J1();
                    wb2Var.requestLayout();
                }
                sqbVar.invalidate();
                jn7.e().k(jn7.C4, new Object[0]);
                break;
            case 19:
                e0 e0Var = ((g0) obj).b;
                e0Var.setText("");
                hl.E3(e0Var);
                break;
            case 20:
                ((ktb) obj).b(true);
                break;
            case 21:
                ((ktb) ((bn0) obj).c).b(true);
                break;
            case 22:
                axb axbVar = (axb) obj;
                ArrayList arrayList = axbVar.f;
                HashSet hashSet = axbVar.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User X1 = axbVar.getMessagesController().X1(Long.valueOf(axbVar.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i2)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) arrayList2.get(i3);
                        axbVar.getMessagesController().a4(chat2, false);
                        axbVar.getMessagesController().d0(chat2.id, X1);
                    }
                    axbVar.finishFragment();
                    break;
                }
                break;
            case 23:
                ((pxb) obj).b.getImageReceiver().w0(false);
                break;
            case 24:
                ((r3c) obj).dismiss();
                break;
            case 25:
                zu1 zu1Var = ((as1) obj).E;
                if (zu1Var.getUserConfig().p() || ((chat = zu1Var.e) != null && chat.autotranslation)) {
                    zu1Var.getMessagesController().j4.K(zu1Var.a(), !r8.A(r0));
                } else {
                    i = ((e) zu1Var).currentAccount;
                    uc7.s1(i).X3.edit().putInt("dialog_show_translate_count" + zu1Var.a(), 14).commit();
                    zu1Var.showDialog(new xk8((e) zu1Var, 13, false));
                }
                zu1Var.zd(true);
                break;
            case 26:
                m01.w((Activity) obj, "https://fragment.com/", false);
                break;
            case 27:
                ((tpc) obj).dismiss();
                break;
            case 28:
                yrc yrcVar = (yrc) obj;
                if (!yrcVar.y && yrcVar.r && !yrcVar.h.b()) {
                    yrcVar.h.setProgress(0.0f);
                    yrcVar.h.d();
                    break;
                }
                break;
            default:
                ((ltc) obj).b(!r7.E);
                break;
        }
    }
}
