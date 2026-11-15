package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ky0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                iy0 iy0Var = (iy0) ((di.k4) this.b).e;
                if (iy0Var != null) {
                    iy0Var.run();
                    break;
                }
                break;
            case 1:
                ((qy0) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                    org.telegram.messenger.ov ovVar = saveToGallerySettingsActivity.c;
                    m10.put(ovVar.d, ovVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((org.telegram.ui.Components.p20) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.gj gjVar = secretMediaViewer.g0;
                if (gjVar != null) {
                    TLRPC.Message message = gjVar.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.l3 l3Var = secretMediaViewer.r;
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
                x11 x11Var = (x11) this.b;
                if (x11Var.W1 instanceof TLRPC.User) {
                    hi.d dVar = x11Var.d2;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        x11Var.e1((TLRPC.User) x11Var.W1, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((w21) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        t9.j0(sessionsActivity.getParentActivity(), 2, new u21(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                d61 d61Var = (d61) this.b;
                org.telegram.messenger.gz.H0 = !org.telegram.messenger.gz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.gz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.j6.k(false, false);
                d61Var.c.setChecked(org.telegram.messenger.gz.H0);
                org.telegram.ui.Cells.z9 z9Var = d61Var.a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().S1 = false;
                    q1Var.H1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.z4, new Object[0]);
                break;
            case 8:
                ((e81) this.b).c(true);
                break;
            case 9:
                ((e81) ((di.f4) this.b).c).c(true);
                break;
            case 10:
                l81 l81Var = (l81) this.b;
                ArrayList arrayList = l81Var.f;
                HashSet hashSet = l81Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = l81Var.getMessagesController().a2(Long.valueOf(l81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        l81Var.getMessagesController().Q3(chat, false);
                        l81Var.getMessagesController().f0(chat.id, a22);
                    }
                    l81Var.finishFragment();
                    break;
                }
                break;
            default:
                wc1 wc1Var = (wc1) this.b;
                wc1Var.a.c(!r0.b(), true);
                wc1Var.c.setEnabled(wc1Var.a.b());
                wc1Var.c.animate().alpha(wc1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
