package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public /* synthetic */ j41(org.telegram.ui.wk wkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.p1 p1Var, ArrayList arrayList2) {
        this.d = wkVar;
        this.e = zArr;
        this.f = str;
        this.n = linearLayout;
        this.b = arrayList;
        this.h = str2;
        this.r = translateController;
        this.s = p1Var;
        this.c = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        String y10;
        switch (this.a) {
            case 0:
                final org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f;
                LinearLayout linearLayout = (LinearLayout) this.n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.r;
                final org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.s;
                boolean z4 = false;
                if (!zArr[0]) {
                    if (str != null && (y10 = v31.y(v31.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, wkVar.getContext(), wkVar.d, false, false);
                        g1Var2.setChecked(true);
                        g1Var2.setText(y10);
                        linearLayout.addView(g1Var2);
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
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, wkVar.getContext(), wkVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z4 = true;
                            }
                            g1Var3.setChecked(z4);
                            g1Var3.setText(language.displayName);
                            if (z4) {
                                g1Var = g1Var3;
                            } else {
                                g1Var = g1Var3;
                                final int i12 = 0;
                                g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h41
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i12) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.b, str3);
                                                p1Var.d(true);
                                                wkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.b, str3);
                                                p1Var.d(true);
                                                wkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(g1Var);
                            i10 = i11;
                            z4 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.m1(wkVar.getContext(), wkVar.d), k7.c6.n(-1, 8));
                    ArrayList arrayList2 = this.c;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i13);
                        final String str4 = language2.code;
                        if (!TextUtils.equals(str4, str2)) {
                            boolean z10 = str != null && str.equals(str4);
                            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(2, wkVar.getContext(), wkVar.d, false, false);
                            g1Var4.setChecked(z10);
                            g1Var4.setText(language2.displayName);
                            if (!z10) {
                                final int i15 = 1;
                                g1Var4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h41
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i15) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.b, str4);
                                                p1Var.d(true);
                                                wkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.b, str4);
                                                p1Var.d(true);
                                                wkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(g1Var4);
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
