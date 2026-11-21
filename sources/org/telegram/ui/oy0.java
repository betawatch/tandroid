package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oy0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                my0 my0Var = (my0) ((di.n4) this.b).e;
                if (my0Var != null) {
                    my0Var.run();
                    break;
                }
                break;
            case 1:
                ((uy0) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                    org.telegram.messenger.kv kvVar = saveToGallerySettingsActivity.c;
                    m10.put(kvVar.d, kvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((org.telegram.ui.Components.a30) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.fj fjVar = secretMediaViewer.g0;
                if (fjVar != null) {
                    TLRPC.Message message = fjVar.k;
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
                c21 c21Var = (c21) this.b;
                if (c21Var.W1 instanceof TLRPC.User) {
                    hi.e eVar = c21Var.d2;
                    if (!eVar.R) {
                        eVar.setLoading(true);
                        c21Var.f1((TLRPC.User) c21Var.W1, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((b31) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        t9.j0(sessionsActivity.getParentActivity(), 2, new z21(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                h61 h61Var = (h61) this.b;
                org.telegram.messenger.bz.H0 = !org.telegram.messenger.bz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.bz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.m6.k(false, false);
                h61Var.c.setChecked(org.telegram.messenger.bz.H0);
                org.telegram.ui.Cells.ba baVar = h61Var.a;
                for (org.telegram.ui.Cells.r1 r1Var : baVar.getCells()) {
                    r1Var.getMessageObject().S1 = false;
                    r1Var.H1();
                    r1Var.requestLayout();
                }
                baVar.invalidate();
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.C4, new Object[0]);
                break;
            case 8:
                ((i81) this.b).c(true);
                break;
            case 9:
                ((i81) ((di.i4) this.b).c).c(true);
                break;
            case 10:
                p81 p81Var = (p81) this.b;
                ArrayList arrayList = p81Var.f;
                HashSet hashSet = p81Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User c22 = p81Var.getMessagesController().c2(Long.valueOf(p81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        p81Var.getMessagesController().X3(chat, false);
                        p81Var.getMessagesController().f0(chat.id, c22);
                    }
                    p81Var.finishFragment();
                    break;
                }
                break;
            default:
                zc1 zc1Var = (zc1) this.b;
                zc1Var.a.c(!r0.b(), true);
                zc1Var.c.setEnabled(zc1Var.a.b());
                zc1Var.c.animate().alpha(zc1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
