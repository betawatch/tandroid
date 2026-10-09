package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Collection d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;

    public /* synthetic */ ge(MessagesController messagesController, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList4, a0.i iVar, a0.i iVar2, Runnable runnable) {
        this.c = messagesController;
        this.b = i10;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.n = messages_dialogs;
        this.h = arrayList4;
        this.r = iVar;
        this.s = iVar2;
        this.v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ((MessagesController) this.c).lambda$processLoadedDialogFilters$22(this.b, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (TLRPC.messages_Dialogs) this.n, (ArrayList) this.h, (a0.i) this.r, (a0.i) this.s, (Runnable) this.v);
                break;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.c;
                Set set = (Set) this.d;
                int[] iArr = (int[]) this.e;
                String[] strArr = (String[]) this.f;
                String[] strArr2 = (String[]) this.h;
                ci.d dVar = (ci.d) this.n;
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) this.r;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.s;
                int[] iArr2 = (int[]) this.v;
                String charSequence = j3Var.getText().toString();
                StringBuilder v = a1.g.v(charSequence);
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "bot";
                    } else if (charSequence.endsWith((String) it.next())) {
                        str = "";
                    }
                }
                v.append(str);
                String sb2 = v.toString();
                int length = sb2.length();
                int i10 = this.b;
                if (length >= 4) {
                    if (sb2.length() <= 32) {
                        if (!TextUtils.equals(strArr2[0], sb2)) {
                            strArr2[0] = sb2;
                            strArr[0] = null;
                            e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                            e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, e6Var));
                            TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                            checkusername.username = sb2;
                            dVar.setLoading(true);
                            iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(checkusername, new a(), new pr(dVar, strArr2, strArr, sb2, e9Var, e6Var, iArr2, 0));
                            break;
                        }
                    } else {
                        if (iArr[0] >= 0) {
                            ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                            iArr[0] = -1;
                        }
                        strArr2[0] = null;
                        strArr[0] = null;
                        dVar.setLoading(false);
                        dVar.setEnabled(false);
                        e9Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                        e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, e6Var));
                        int i11 = -iArr2[0];
                        iArr2[0] = i11;
                        AndroidUtilities.shakeViewSpring(e9Var, i11);
                        break;
                    }
                } else {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    e9Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, e6Var));
                    int i12 = -iArr2[0];
                    iArr2[0] = i12;
                    AndroidUtilities.shakeViewSpring(e9Var, i12);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ge(org.telegram.ui.Cells.j3 j3Var, Set set, int[] iArr, int i10, String[] strArr, String[] strArr2, ci.d dVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr2) {
        this.c = j3Var;
        this.d = set;
        this.e = iArr;
        this.b = i10;
        this.f = strArr;
        this.h = strArr2;
        this.n = dVar;
        this.r = e9Var;
        this.s = e6Var;
        this.v = iArr2;
    }
}
