package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ny0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ly0 ly0Var = (ly0) ((di.n4) this.b).e;
                if (ly0Var != null) {
                    ly0Var.run();
                    break;
                }
                break;
            case 1:
                ((ty0) this.b).dismiss();
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
                ((org.telegram.ui.Components.x20) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                org.telegram.messenger.fj fjVar = secretMediaViewer.g0;
                if (fjVar != null) {
                    TLRPC.Message message = fjVar.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.u3 u3Var = secretMediaViewer.r;
                        if (u3Var.W) {
                            u3Var.f(true);
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
                if (a21Var.W1 instanceof TLRPC.User) {
                    hi.e eVar = a21Var.d2;
                    if (!eVar.R) {
                        eVar.setLoading(true);
                        a21Var.f1((TLRPC.User) a21Var.W1, null, null);
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
                        t9.j0(sessionsActivity.getParentActivity(), 2, new x21(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                f61 f61Var = (f61) this.b;
                org.telegram.messenger.bz.H0 = !org.telegram.messenger.bz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.bz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.n6.k(false, false);
                f61Var.c.setChecked(org.telegram.messenger.bz.H0);
                org.telegram.ui.Cells.ba baVar = f61Var.a;
                for (org.telegram.ui.Cells.r1 r1Var : baVar.getCells()) {
                    r1Var.getMessageObject().S1 = false;
                    r1Var.H1();
                    r1Var.requestLayout();
                }
                baVar.invalidate();
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.C4, new Object[0]);
                break;
            case 8:
                ((g81) this.b).c(true);
                break;
            case 9:
                ((g81) ((di.i4) this.b).c).c(true);
                break;
            case 10:
                n81 n81Var = (n81) this.b;
                ArrayList arrayList = n81Var.f;
                HashSet hashSet = n81Var.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User c22 = n81Var.getMessagesController().c2(Long.valueOf(n81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        n81Var.getMessagesController().X3(chat, false);
                        n81Var.getMessagesController().f0(chat.id, c22);
                    }
                    n81Var.finishFragment();
                    break;
                }
                break;
            default:
                xc1 xc1Var = (xc1) this.b;
                xc1Var.a.c(!r0.b(), true);
                xc1Var.c.setEnabled(xc1Var.a.b());
                xc1Var.c.animate().alpha(xc1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
