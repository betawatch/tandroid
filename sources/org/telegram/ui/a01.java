package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a01 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yz0 yz0Var = (yz0) ((jg.b1) this.b).e;
                if (yz0Var != null) {
                    yz0Var.run();
                    break;
                }
                break;
            case 1:
                ((g01) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                    org.telegram.messenger.bw bwVar = saveToGallerySettingsActivity.c;
                    m10.put(bwVar.d, bwVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((org.telegram.ui.Components.e30) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.jj jjVar = secretMediaViewer.f0;
                if (jjVar != null) {
                    TLRPC.Message message = jjVar.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        vh.p2 p2Var = secretMediaViewer.r;
                        if (p2Var.V) {
                            p2Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.m();
                            break;
                        }
                    }
                }
                break;
            case 5:
                s31 s31Var = (s31) this.b;
                if (s31Var.S1 instanceof TLRPC.User) {
                    vh.d dVar = s31Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        s31Var.e1((TLRPC.User) s31Var.S1, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((q41) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        u9.i0(sessionsActivity.getParentActivity(), 2, new o41(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                y71 y71Var = (y71) this.b;
                org.telegram.messenger.tz.H0 = !org.telegram.messenger.tz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.tz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.t6.k(false, false);
                y71Var.c.setChecked(org.telegram.messenger.tz.H0);
                org.telegram.ui.Cells.z9 z9Var = y71Var.a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.E1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.z4, new Object[0]);
                break;
            case 8:
                ((x91) this.b).c(true);
                break;
            case 9:
                ((x91) ((mg.s) this.b).c).c(true);
                break;
            case 10:
                ea1 ea1Var = (ea1) this.b;
                ArrayList arrayList = ea1Var.f;
                HashSet hashSet = ea1Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User Z1 = ea1Var.getMessagesController().Z1(Long.valueOf(ea1Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ea1Var.getMessagesController().N3(chat, false);
                        ea1Var.getMessagesController().f0(chat.id, Z1);
                    }
                    ea1Var.finishFragment();
                    break;
                }
                break;
            default:
                te1 te1Var = (te1) this.b;
                te1Var.a.c(!r0.b(), true);
                te1Var.c.setEnabled(te1Var.a.b());
                te1Var.c.animate().alpha(te1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
