// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oha implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oha(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d Q;
        TLRPC.Chat chat;
        int i;
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                tha thaVar = (tha) obj;
                if (thaVar.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    qha qhaVar = thaVar.d;
                    int i2 = thaVar.c[intValue];
                    k47 k47Var = thaVar.b[intValue];
                    ch4 ch4Var = ((ah4) ((sz4) qhaVar).a).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
                    ch4Var.e(i2, thaVar, k47Var, intValue);
                    break;
                }
                break;
            case 1:
                uja ujaVar = (uja) obj;
                if (!ujaVar.y.f) {
                    if (ujaVar.x.f) {
                        rja rjaVar = ujaVar.a;
                        boolean z = ujaVar.b;
                        c6 c6Var = rjaVar.W;
                        if (c6Var != null) {
                            c6Var.b(z ? 1 : 0);
                            break;
                        }
                    } else if (ujaVar.c == tja.b) {
                        gm.A3(4.0f, ujaVar, null);
                        break;
                    }
                }
                break;
            case 2:
                DictationAsr.a0(!DictationAsr.x());
                ((ana) obj).e0();
                break;
            case 3:
                ((kpa) obj).dismiss();
                break;
            case 4:
                ((lqa) obj).run();
                break;
            case 5:
                ((lqa) obj).run();
                break;
            case 6:
                asa asaVar = (asa) obj;
                new exa(asaVar.b, asaVar.g).show();
                break;
            case 7:
                ((usa) obj).dismiss();
                break;
            case 8:
                ((qva) obj).run();
                break;
            case 9:
                if (((cxa) ((ds0) obj).d).e > 0 && (Q = LaunchActivity.Q()) != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    Q.showAsSheet(new nxa(), bh0Var);
                    break;
                }
                break;
            case 10:
                ((h0b) obj).dismiss();
                d Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new kj8(Q2, 14, false));
                    break;
                }
                break;
            case 11:
                ((a1b) obj).b.getImageReceiver().w0(false);
                break;
            case 12:
                gm.d3((b2a) obj, 100L);
                break;
            case 13:
                s1b s1bVar = (s1b) obj;
                TextView textView = s1bVar.F;
                TextView textView2 = s1bVar.E;
                cj8 cj8Var = s1bVar.G;
                if (cj8Var.getVisibility() != 0 || !cj8Var.w.isEnabled()) {
                    if (textView2.getVisibility() == 0 && textView2.isEnabled()) {
                        textView2.performClick();
                        break;
                    } else if (textView.getVisibility() == 0 && textView.isEnabled()) {
                        textView.performClick();
                        break;
                    }
                } else {
                    cj8Var.performClick();
                    break;
                }
                break;
            case 14:
                e3b e3bVar = (e3b) obj;
                LongSparseArray longSparseArray = e3bVar.n;
                v94 v94Var = (v94) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v94Var.getStickerSet();
                if (stickerSet != null && e3bVar.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (v94Var.r) {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        e3bVar.e.a.h(v94Var.getStickerSet());
                        break;
                    } else {
                        e3bVar.F(stickerSet, v94Var);
                        break;
                    }
                }
                break;
            case 15:
                ((n6b) obj).onBackPressed();
                break;
            case 16:
                x6b x6bVar = (x6b) obj;
                x6bVar.onClick(x6bVar.b);
                break;
            case 17:
                m7b m7bVar = (m7b) ((wx7) obj).h;
                if (m7bVar != null) {
                    m7bVar.run();
                    break;
                }
                break;
            case 18:
                x9b x9bVar = (x9b) obj;
                x9bVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new hab(x9bVar, b2)).start();
                break;
            case 19:
                ((xfb) obj).dismiss();
                break;
            case 20:
                tmb tmbVar = (tmb) obj;
                gda.D0 = !gda.D0;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("compactMode", gda.D0);
                edit.apply();
                cmb.j(false, false);
                tmbVar.c.setChecked(gda.D0);
                uob uobVar = tmbVar.a;
                for (rc2 rc2Var : uobVar.getCells()) {
                    rc2Var.getMessageObject().S1 = false;
                    rc2Var.J1();
                    rc2Var.requestLayout();
                }
                uobVar.invalidate();
                nm7.e().k(nm7.D4, new Object[0]);
                break;
            case 21:
                e0 e0Var = ((g0) obj).b;
                e0Var.setText("");
                gm.E3(e0Var);
                break;
            case 22:
                ((krb) obj).b(true);
                break;
            case 23:
                ((krb) ((bo0) obj).c).b(true);
                break;
            case 24:
                avb avbVar = (avb) obj;
                ArrayList arrayList = avbVar.f;
                HashSet hashSet = avbVar.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User W1 = avbVar.getMessagesController().W1(Long.valueOf(avbVar.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i3)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) arrayList2.get(i4);
                        avbVar.getMessagesController().V3(chat2, false);
                        avbVar.getMessagesController().b0(chat2.id, W1);
                    }
                    avbVar.finishFragment();
                    break;
                }
                break;
            case 25:
                ((pvb) obj).b.getImageReceiver().w0(false);
                break;
            case 26:
                ((s1c) obj).dismiss();
                break;
            case 27:
                yv1 yv1Var = ((zs1) obj).E;
                if (yv1Var.getUserConfig().p() || ((chat = yv1Var.e) != null && chat.autotranslation)) {
                    yv1Var.getMessagesController().i4.K(yv1Var.a(), !r8.A(r0));
                } else {
                    i = ((d) yv1Var).currentAccount;
                    oc7.r1(i).W3.edit().putInt("dialog_show_translate_count" + yv1Var.a(), 14).commit();
                    yv1Var.showDialog(new kj8((d) yv1Var, 13, false));
                }
                yv1Var.zd(true);
                break;
            case 28:
                l11.w((Activity) obj, "https://fragment.com/", false);
                break;
            default:
                ((fnc) obj).dismiss();
                break;
        }
    }
}
