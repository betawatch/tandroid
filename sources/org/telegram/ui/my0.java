package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ my0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ky0 ky0Var = (ky0) ((bi.m5) this.b).e;
                if (ky0Var != null) {
                    ky0Var.run();
                    break;
                }
                break;
            case 1:
                ((sy0) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                    org.telegram.messenger.qv qvVar = saveToGallerySettingsActivity.c;
                    m10.put(qvVar.d, qvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((org.telegram.ui.Components.m20) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.ij ijVar = secretMediaViewer.f0;
                if (ijVar != null) {
                    TLRPC.Message message = ijVar.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.m3 m3Var = secretMediaViewer.r;
                        if (m3Var.V) {
                            m3Var.f(true);
                            break;
                        } else {
                            secretMediaViewer.m();
                            break;
                        }
                    }
                }
                break;
            case 5:
                a21 a21Var = (a21) this.b;
                if (a21Var.S1 instanceof TLRPC.User) {
                    fi.d dVar = a21Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        a21Var.e1((TLRPC.User) a21Var.S1, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((z21) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        s9.j0(sessionsActivity.getParentActivity(), 2, new x21(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                g61 g61Var = (g61) this.b;
                org.telegram.messenger.iz.H0 = !org.telegram.messenger.iz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.iz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.k6.k(false, false);
                g61Var.c.setChecked(org.telegram.messenger.iz.H0);
                org.telegram.ui.Cells.z9 z9Var = g61Var.a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.G1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.z4, new Object[0]);
                break;
            case 8:
                ((f81) this.b).c(true);
                break;
            case 9:
                ((f81) ((bi.g5) this.b).c).c(true);
                break;
            case 10:
                m81 m81Var = (m81) this.b;
                ArrayList arrayList = m81Var.f;
                HashSet hashSet = m81Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = m81Var.getMessagesController().a2(Long.valueOf(m81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        m81Var.getMessagesController().Q3(chat, false);
                        m81Var.getMessagesController().f0(chat.id, a22);
                    }
                    m81Var.finishFragment();
                    break;
                }
                break;
            default:
                vc1 vc1Var = (vc1) this.b;
                vc1Var.a.c(!r0.b(), true);
                vc1Var.c.setEnabled(vc1Var.a.b());
                vc1Var.c.animate().alpha(vc1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
