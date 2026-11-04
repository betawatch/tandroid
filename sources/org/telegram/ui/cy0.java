package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ay0 ay0Var = (ay0) ((ci.t4) this.b).e;
                if (ay0Var != null) {
                    ay0Var.run();
                    break;
                }
                break;
            case 1:
                ((iy0) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                    org.telegram.messenger.iv ivVar = saveToGallerySettingsActivity.c;
                    m10.put(ivVar.d, ivVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((org.telegram.ui.Components.i20) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.zi ziVar = secretMediaViewer.g0;
                if (ziVar != null) {
                    TLRPC.Message message = ziVar.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        gi.l3 l3Var = secretMediaViewer.r;
                        if (l3Var.W) {
                            l3Var.f(true);
                            break;
                        } else {
                            secretMediaViewer.m();
                            break;
                        }
                    }
                }
                break;
            case 5:
                q11 q11Var = (q11) this.b;
                if (q11Var.T1 instanceof TLRPC.User) {
                    gi.d dVar = q11Var.a2;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        q11Var.e1((TLRPC.User) q11Var.T1, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((p21) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        s9.j0(sessionsActivity.getParentActivity(), 2, new n21(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                w51 w51Var = (w51) this.b;
                org.telegram.messenger.az.H0 = !org.telegram.messenger.az.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.az.H0);
                edit.apply();
                org.telegram.ui.ActionBar.k6.k(false, false);
                w51Var.c.setChecked(org.telegram.messenger.az.H0);
                org.telegram.ui.Cells.z9 z9Var = w51Var.a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.G1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.z4, new Object[0]);
                break;
            case 8:
                ((w71) this.b).c(true);
                break;
            case 9:
                ((w71) ((ci.o4) this.b).c).c(true);
                break;
            case 10:
                d81 d81Var = (d81) this.b;
                ArrayList arrayList = d81Var.f;
                HashSet hashSet = d81Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = d81Var.getMessagesController().a2(Long.valueOf(d81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i3)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i3));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        d81Var.getMessagesController().Q3(chat, false);
                        d81Var.getMessagesController().f0(chat.id, a22);
                    }
                    d81Var.finishFragment();
                    break;
                }
                break;
            default:
                rc1 rc1Var = (rc1) this.b;
                rc1Var.a.c(!r0.b(), true);
                rc1Var.c.setEnabled(rc1Var.a.b());
                rc1Var.c.animate().alpha(rc1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
