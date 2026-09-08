package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class j41 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ j41(org.telegram.ui.zk zkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = zkVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = translateController;
        this.s = n1Var;
        this.c = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        String y3;
        switch (this.a) {
            case 0:
                final org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.s;
                boolean z10 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = u31.y(u31.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                        f1Var2.setChecked(true);
                        f1Var2.setText(y3);
                        linearLayout.addView(f1Var2);
                    }
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z10 = true;
                            }
                            f1Var3.setChecked(z10);
                            f1Var3.setText(language.displayName);
                            if (z10) {
                                f1Var = f1Var3;
                            } else {
                                f1Var = f1Var3;
                                final int i12 = 0;
                                f1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h41
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i12) {
                                            case 0:
                                                org.telegram.ui.zk zkVar2 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar2.b, str3);
                                                n1Var.d(true);
                                                zkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.zk zkVar3 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar3.b, str3);
                                                n1Var.d(true);
                                                zkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var);
                            i10 = i11;
                            z10 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(zkVar.getContext(), zkVar.d), w7.x5.n(-1, 8));
                    ArrayList arrayList2 = this.c;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i13);
                        final String str4 = language2.code;
                        if (!TextUtils.equals(str4, str2)) {
                            boolean z11 = str != null && str.equals(str4);
                            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                            f1Var4.setChecked(z11);
                            f1Var4.setText(language2.displayName);
                            if (!z11) {
                                final int i15 = 1;
                                f1Var4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h41
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i15) {
                                            case 0:
                                                org.telegram.ui.zk zkVar2 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar2.b, str4);
                                                n1Var.d(true);
                                                zkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.zk zkVar3 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar3.b, str4);
                                                n1Var.d(true);
                                                zkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var4);
                        }
                        i13 = i14;
                    }
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList<TLRPC.EncryptedChat> arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                ArrayList arrayList5 = (ArrayList) this.h;
                ArrayList arrayList6 = (ArrayList) this.n;
                ArrayList arrayList7 = (ArrayList) this.r;
                ArrayList arrayList8 = (ArrayList) this.s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats(arrayList3, true);
                int i16 = notificationsCustomSettingsActivity.s;
                if (i16 == 1) {
                    notificationsCustomSettingsActivity.w = arrayList4;
                } else if (i16 == 0) {
                    notificationsCustomSettingsActivity.w = arrayList5;
                } else if (i16 == 3) {
                    notificationsCustomSettingsActivity.w = arrayList6;
                    notificationsCustomSettingsActivity.v = arrayList7;
                } else {
                    notificationsCustomSettingsActivity.w = arrayList8;
                }
                notificationsCustomSettingsActivity.l0(true);
                break;
        }
    }

    public /* synthetic */ j41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.b = arrayList;
        this.c = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.h = arrayList5;
        this.n = arrayList6;
        this.r = arrayList7;
        this.s = arrayList8;
    }
}
