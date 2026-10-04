package ci;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class x9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final i9 E;
    public boolean F;
    public org.telegram.ui.ActionBar.b2 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final /* synthetic */ ea W;
    public int a;
    public final a0.i b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final zl0 f;
    public final s4.c0 h;
    public final t9 n;
    public final v9 r;
    public final View s;
    public final d v;
    public final d w;
    public final q9 x;
    public final org.telegram.ui.Cells.v3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(ea eaVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var6;
        org.telegram.ui.ActionBar.d6 d6Var7;
        org.telegram.ui.ActionBar.d6 d6Var8;
        org.telegram.ui.ActionBar.d6 d6Var9;
        this.W = eaVar;
        this.b = new a0.i();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, d6Var);
        this.y = v3Var;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        q9 q9Var = new q9(this, context, d6Var2, new l9(this, 4));
        this.x = q9Var;
        int i12 = org.telegram.ui.ActionBar.i6.h5;
        q9Var.setBackgroundColor(eaVar.getThemedColor(i12));
        q9Var.setOnSearchTextChange(new m9(this, 3));
        d6Var3 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        i9 i9Var = new i9(context, d6Var3);
        this.E = i9Var;
        i9Var.h = new l9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var4 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        zl0 zl0Var = new zl0(context, d6Var4);
        this.f = zl0Var;
        zl0Var.setClipToPadding(false);
        zl0Var.setTranslateSelector(true);
        d6Var5 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        t9 t9Var = new t9(this, context, d6Var5, q9Var, new ai.r5(eaVar, 2));
        this.n = t9Var;
        zl0Var.setAdapter(t9Var);
        t9Var.h = zl0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setOnScrollListener(new r9(0, this));
        zl0Var.setOnItemClickListener(new ah.b(6, this, context));
        frameLayout.addView(zl0Var, w7.z5.c(-1.0f, -1));
        s9 s9Var = new s9(this);
        s9Var.n(350L);
        s9Var.o(tr.h);
        s9Var.C = false;
        s9Var.m = false;
        zl0Var.setItemAnimator(s9Var);
        frameLayout.addView(q9Var, w7.z5.e(-1, -2, 55));
        frameLayout.addView(v3Var, w7.z5.e(-1, 32, 55));
        addView(i9Var, w7.z5.e(-1, -2, 55));
        v9 v9Var = new v9(this, context);
        this.r = v9Var;
        v9Var.setClickable(true);
        v9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) eaVar).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) eaVar).backgroundPaddingLeft;
        v9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        d6Var6 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        v9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var6));
        d6Var7 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        d dVar = new d(context, d6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new k9(this, 0));
        dVar.e();
        v9Var.addView(dVar, w7.z5.q(-1, 48, 87));
        d6Var8 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        d dVar2 = new d(context, d6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new k9(this, 1));
        dVar2.e();
        v9Var.addView(dVar2, w7.z5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        d6Var9 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var9));
        addView(view, w7.z5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(v9Var, w7.z5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
        arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
        int i11 = 0;
        while (true) {
            a0.i iVar = this.b;
            if (i11 >= iVar.m()) {
                break;
            }
            long j3 = iVar.j(i11);
            if (!((Boolean) iVar.n(i11)).booleanValue()) {
                arrayList.remove(Long.valueOf(j3));
            } else if (!arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(j3));
            }
            i11++;
        }
        if (z10) {
            g(true);
            e(true);
            f(true);
        }
    }

    public final void b(int i10) {
        this.a = i10;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        ea eaVar = this.W;
        if (i10 == 4) {
            arrayList.addAll(eaVar.d);
            hashMap.putAll(eaVar.e);
        } else if (i10 == 5) {
            arrayList.addAll(eaVar.J);
        } else if (i10 == 1) {
            ArrayList J0 = ea.J0(eaVar);
            for (int i11 = 0; i11 < J0.size(); i11 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) J0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(eaVar.h);
        } else if (i10 == 3) {
            arrayList.addAll(eaVar.n);
            hashMap.putAll(eaVar.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        q9 q9Var = this.x;
        q9Var.setText("");
        q9Var.setVisibility(i10 == 0 ? 8 : 0);
        q9Var.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        zl0 zl0Var = this.f;
        if (i12 != 0) {
            zl0Var.v0(0);
        }
        zl0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.f0.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.J), 0);
        while (true) {
            zl0 zl0Var = this.f;
            if (i10 >= zl0Var.getChildCount()) {
                return f7;
            }
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f7, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j3, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z10 = i11 == 1 || i11 == 2;
        ea eaVar = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j10 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j10 != 0) {
                    if (!z10 || user.contact) {
                        arrayList.add(Long.valueOf(j10));
                    } else {
                        arrayList2.add(Long.valueOf(j10));
                    }
                    this.c.remove(Long.valueOf(j10));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j3), arrayList);
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.x.K = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            d6Var2 = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var2);
            alertDialog$Builder.a.T = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, d6Var);
        alertDialog$Builder2.a.T = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new p9(this, j3, arrayList, 0));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (b2Var = this.G) == null || this.H != chatFull.id) {
            return;
        }
        b2Var.c(350L);
        this.G = null;
        this.H = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10;
        int i11 = this.a;
        ea eaVar = this.W;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (eaVar.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (eaVar.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = eaVar.I;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(eaVar.K ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i13), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i11 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        v9 v9Var = this.r;
        if (i11 == 3) {
            int size = ea.l1(arrayList, this.d).size();
            eaVar.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            v9Var.b(size <= 0, z10);
            dVar2.b(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.b(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i11 != 6) {
            if (i11 == 4) {
                int size2 = ea.l1(eaVar.d, eaVar.e).size();
                eaVar.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                v9Var.b(false, z10);
                dVar2.b(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
        i10 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
        ai.l9 storiesController = MessagesController.getInstance(i10).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.i iVar = this.b;
                if (i12 >= iVar.m()) {
                    break;
                }
                long j3 = iVar.j(i12);
                ((Boolean) iVar.n(i12)).getClass();
                storiesController.L.contains(Long.valueOf(j3));
                i12++;
            }
        } else {
            dVar2.b(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        ea eaVar = this.W;
        ArrayList arrayList2 = eaVar.J;
        HashMap hashMap = eaVar.r;
        ArrayList arrayList3 = eaVar.n;
        ArrayList arrayList4 = eaVar.h;
        HashMap hashMap2 = eaVar.e;
        ArrayList arrayList5 = eaVar.d;
        int i10 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (eaVar.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    eaVar.N = i11;
                }
            } else {
                this.R = eaVar.N;
                eaVar.N = 3;
            }
        }
        HashSet l1 = ea.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            if (i12 >= arrayList.size()) {
                break;
            }
            j9 j9Var = (j9) arrayList.get(i12);
            if (j9Var != null) {
                int i13 = j9Var.i;
                if (i13 > 0) {
                    j9Var.k = eaVar.N == i13;
                    j9Var.l = false;
                } else {
                    TLRPC.User user = j9Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        j9Var.k = contains;
                        j9Var.l = !contains && l1.contains(Long.valueOf(j9Var.g.id));
                    } else {
                        TLRPC.Chat chat = j9Var.h;
                        if (chat != null) {
                            j9Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            j9Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            zl0 zl0Var = this.f;
            if (i14 >= zl0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = zl0Var.getChildAt(i14);
            if ((childAt instanceof da) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                j9 j9Var2 = (j9) arrayList.get(R);
                da daVar = (da) childAt;
                daVar.c(j9Var2.k || j9Var2.l, z10);
                TLRPC.Chat chat2 = j9Var2.h;
                if (chat2 != null) {
                    daVar.b(ea.d1(eaVar, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (j9Var2.l && !j9Var2.k) {
                        r8 = 0.5f;
                    }
                    daVar.b(r8, z10);
                }
            }
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0498  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z10) {
        float dp;
        float dp2;
        t9 t9Var;
        boolean z11;
        int i10;
        float dp3;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        boolean containsKey;
        int i14;
        int i15;
        boolean z16;
        boolean z17;
        int i16;
        int i17;
        int i18;
        String formatPluralString;
        float f7;
        boolean z18;
        j9 j9Var;
        boolean z19;
        String formatPluralString2;
        int i19;
        long clientUserId;
        j9 j9Var2;
        String formatPluralString3;
        int i20;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        ea eaVar = this.W;
        ArrayList arrayList = eaVar.n;
        ArrayList arrayList2 = eaVar.d;
        ArrayList arrayList3 = eaVar.h;
        HashSet hashSet = eaVar.v;
        ArrayList arrayList4 = this.K;
        arrayList4.clear();
        ArrayList arrayList5 = this.L;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i26 = this.a;
        org.telegram.ui.Cells.v3 v3Var = this.y;
        if (i26 != 0) {
            i9 i9Var = this.E;
            if (i26 == 1) {
                i9Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                i9Var.d(true);
                ((org.telegram.ui.ActionBar.g2) i9Var.e).c(0.0f, false);
                arrayList5.add(j9.d());
                arrayList5.add(j9.c());
                arrayList5.size();
                arrayList5.add(j9.e());
                arrayList5.add(j9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 2) {
                i9Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                i9Var.d(true);
                ((org.telegram.ui.ActionBar.g2) i9Var.e).c(0.0f, false);
                arrayList5.add(j9.d());
                arrayList5.add(j9.c());
                arrayList5.size();
                arrayList5.add(j9.e());
                arrayList5.add(j9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 3) {
                i9Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                i9Var.d(true);
                ((org.telegram.ui.ActionBar.g2) i9Var.e).c(0.0f, false);
                arrayList5.add(j9.d());
                arrayList5.add(j9.c());
                arrayList5.size();
                arrayList5.add(j9.e());
                arrayList5.add(j9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 5) {
                i9Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                i9Var.d(eaVar.O);
                ((org.telegram.ui.ActionBar.g2) i9Var.e).c(0.0f, false);
                arrayList5.add(j9.d());
                arrayList5.add(j9.c());
                arrayList5.size();
                arrayList5.add(j9.e());
                arrayList5.add(j9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 6) {
                i9Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                i9Var.d(true);
                ((org.telegram.ui.ActionBar.g2) i9Var.e).c(0.0f, false);
                arrayList5.add(j9.d());
                arrayList5.add(j9.c());
                arrayList5.size();
                arrayList5.add(j9.e());
                arrayList5.add(j9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 4) {
                i9Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                i9Var.d(true);
                ((org.telegram.ui.ActionBar.g2) i9Var.e).c(0.0f, false);
                arrayList5.add(j9.d());
                arrayList5.add(j9.c());
                arrayList5.size();
                arrayList5.add(j9.e());
                arrayList5.add(j9.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.F = true;
                boolean isEmpty = TextUtils.isEmpty(this.I);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.I).toLowerCase();
                    int i27 = this.a;
                    ArrayList Y0 = i27 == 5 ? ea.Y0(eaVar) : ea.Z0(eaVar, i27 == 1 || i27 == 2, eaVar.Y && (i27 == 3 || i27 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = ea.l1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.J;
                    if (isEmpty) {
                        if (!z10) {
                            arrayList7.clear();
                            int i28 = 0;
                            while (i28 < Y0.size()) {
                                TLObject tLObject = (TLObject) Y0.get(i28);
                                if (tLObject instanceof TLRPC.User) {
                                    z15 = isEmpty;
                                    containsKey = arrayList6.contains(Long.valueOf(((TLRPC.User) tLObject).id));
                                } else {
                                    z15 = isEmpty;
                                    containsKey = tLObject instanceof TLRPC.Chat ? hashMap.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false;
                                }
                                if (containsKey) {
                                    arrayList7.add(tLObject);
                                }
                                i28++;
                                isEmpty = z15;
                            }
                        }
                        z11 = isEmpty;
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < arrayList7.size()) {
                            TLObject tLObject2 = (TLObject) arrayList7.get(i29);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList6.contains(Long.valueOf(user.id));
                                i12 = i29;
                                i13 = i30;
                                j9 i31 = j9.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
                                int i32 = this.a;
                                i31.m = i32 == 2 || i32 == 4;
                                arrayList5.add(i31);
                                dp += AndroidUtilities.dp(56.0f);
                            } else {
                                i12 = i29;
                                i13 = i30;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey2 = hashMap.containsKey(Long.valueOf(chat.id));
                                    float f10 = dp;
                                    j9 j9Var3 = new j9(3, true);
                                    j9Var3.h = chat;
                                    j9Var3.k = containsKey2;
                                    int i33 = this.a;
                                    j9Var3.m = i33 == 2 || i33 == 4;
                                    arrayList5.add(j9Var3);
                                    dp = f10 + AndroidUtilities.dp(56.0f);
                                } else {
                                    i30 = i13;
                                    i29 = i12 + 1;
                                }
                            }
                            i30 = i13 + 1;
                            i29 = i12 + 1;
                        }
                        i10 = i30;
                    } else {
                        z11 = isEmpty;
                        i10 = 0;
                    }
                    int i34 = 0;
                    while (i34 < Y0.size()) {
                        TLObject tLObject3 = (TLObject) Y0.get(i34);
                        if (z11 && arrayList7.contains(tLObject3)) {
                            i11 = i34;
                        } else {
                            if (!TextUtils.isEmpty(lowerCase)) {
                                if (tLObject3 instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject3;
                                    String lowerCase2 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.f0.w(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.f0.w(" ", lowerCase, lowerCase3)) {
                                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                                            if (arrayList8 != null) {
                                                int i35 = 0;
                                                while (i35 < arrayList8.size()) {
                                                    TLRPC.TL_username tL_username = arrayList8.get(i35);
                                                    i11 = i34;
                                                    if (tL_username.active && AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                        z13 = true;
                                                        break;
                                                    } else {
                                                        i35++;
                                                        i34 = i11;
                                                    }
                                                }
                                            }
                                            i11 = i34;
                                            z13 = false;
                                        }
                                    }
                                } else {
                                    i11 = i34;
                                    if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                        String lowerCase4 = AndroidUtilities.translitSafe(chat2.title).toLowerCase();
                                        if (!lowerCase4.startsWith(lowerCase) && !org.telegram.messenger.f0.w(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !org.telegram.messenger.f0.w(" ", lowerCase, lowerCase5)) {
                                                ArrayList<TLRPC.TL_username> arrayList9 = chat2.usernames;
                                                if (arrayList9 != null) {
                                                    for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                                                        TLRPC.TL_username tL_username2 = arrayList9.get(i36);
                                                        if (!tL_username2.active || !AndroidUtilities.translitSafe(tL_username2.username).toLowerCase().startsWith(lowerCase)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z13 = true;
                                        break;
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    if (tLObject3 instanceof TLRPC.User) {
                                        TLRPC.User user3 = (TLRPC.User) tLObject3;
                                        boolean contains2 = arrayList6.contains(Long.valueOf(user3.id));
                                        j9 i37 = j9.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i38 = this.a;
                                        i37.m = i38 == 2 || i38 == 4;
                                        arrayList5.add(i37);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        j9 j9Var4 = new j9(3, true);
                                        j9Var4.h = chat3;
                                        j9Var4.k = containsKey3;
                                        int i39 = this.a;
                                        if (i39 != 2 && i39 != 4) {
                                            z14 = false;
                                            j9Var4.m = z14;
                                            arrayList5.add(j9Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i34 = i11 + 1;
                                        }
                                        z14 = true;
                                        j9Var4.m = z14;
                                        arrayList5.add(j9Var4);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                        i34 = i11 + 1;
                                    }
                                }
                            }
                            i11 = i34;
                            z13 = true;
                            if (z13) {
                            }
                        }
                        i34 = i11 + 1;
                    }
                    if (!z11) {
                        if (i10 == 0) {
                            arrayList5.add(new j9(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        zl0 zl0Var = this.f;
                        if (zl0Var != null) {
                            int measuredHeight = (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()) - zl0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.T : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f11 = dp3 - dp;
                        if (f11 > 0.0f) {
                            j9 j9Var5 = new j9(-1, false);
                            j9Var5.p = (int) f11;
                            arrayList5.add(j9Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                t9Var = this.n;
                if (t9Var != null) {
                    if (!z10 || eaVar.N == 0) {
                        t9Var.l();
                    } else {
                        t9Var.E(arrayList4, arrayList5);
                    }
                }
                this.e.invalidate();
            }
            dp = dp2;
            boolean isEmpty2 = TextUtils.isEmpty(this.I);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            t9Var = this.n;
            if (t9Var != null) {
            }
            this.e.invalidate();
        }
        this.F = false;
        v3Var.setVisibility(8);
        i14 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i14).getStoriesController().T;
        j9 j9Var6 = new j9(-1, false);
        j9Var6.o = 24;
        arrayList5.add(j9Var6);
        if (eaVar.L) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            j9 j9Var7 = new j9(11, false);
            j9Var7.e = string;
            arrayList5.add(j9Var7);
            j9Var6.o = AndroidUtilities.dp(72.0f) + j9Var6.o;
        } else if (eaVar.F && (eaVar.Z || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = eaVar.Z ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(eaVar.K ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (eaVar.K) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i40 = eaVar.Q;
                formatPluralString = i40 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i40 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            j9 j9Var8 = new j9(4, false);
            j9Var8.e = string2;
            j9Var8.f = formatPluralString;
            arrayList5.add(j9Var8);
            j9Var6.o = AndroidUtilities.dp(72.0f) + j9Var6.o;
        } else {
            String string3 = LocaleController.getString(eaVar.K ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            j9 j9Var9 = new j9(8, false);
            j9Var9.e = string3;
            arrayList5.add(j9Var9);
            j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
            TLRPC.InputPeer inputPeer = eaVar.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i15 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                j9 i41 = j9.i(UserConfig.getInstance(i15).getCurrentUser(), false, false);
                i41.n = true;
                arrayList5.add(i41);
                j9Var6.o = AndroidUtilities.dp(62.0f) + j9Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i18 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                j9 i42 = j9.i(MessagesController.getInstance(i18).getUser(Long.valueOf(eaVar.c.user_id)), false, false);
                i42.n = true;
                arrayList5.add(i42);
                j9Var6.o = AndroidUtilities.dp(62.0f) + j9Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i17 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(eaVar.c.channel_id));
                    j9 j9Var10 = new j9(3, true);
                    j9Var10.h = chat4;
                    j9Var10.k = false;
                    j9Var10.n = true;
                    arrayList5.add(j9Var10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    j9Var6.o = AndroidUtilities.dp(104.0f) + j9Var6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i16 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i16).getChat(Long.valueOf(eaVar.c.chat_id));
                    j9 j9Var11 = new j9(3, true);
                    j9Var11.h = chat5;
                    j9Var11.k = false;
                    j9Var11.n = true;
                    arrayList5.add(j9Var11);
                    j9Var6.o = AndroidUtilities.dp(104.0f) + j9Var6.o;
                    z17 = false;
                }
                z16 = false;
                j9 g10 = j9.g(null);
                g10.c = !z16 ? 1 : 2;
                arrayList5.add(g10);
                j9Var6.o = AndroidUtilities.dp(12.0f) + j9Var6.o;
                if (z16) {
                    String string4 = LocaleController.getString(eaVar.K ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    j9 j9Var12 = new j9(8, false);
                    j9Var12.e = string4;
                    arrayList5.add(j9Var12);
                    j9Var6.o = AndroidUtilities.dp(40.0f) + j9Var6.o;
                }
                if (z16 || eaVar.L) {
                    f7 = 80.0f;
                } else {
                    j9 h = j9.h(4, eaVar.f, eaVar.N == 4);
                    arrayList5.add(h);
                    j9Var6.o = AndroidUtilities.dp(56.0f) + j9Var6.o;
                    f7 = 80.0f;
                    if (eaVar.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = eaVar.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i24 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                                    h.g = MessagesController.getInstance(i24).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i25 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                            h.g = MessagesController.getInstance(i25).getUser((Long) arrayList2.get(0));
                        }
                    }
                    j9 h10 = j9.h(2, arrayList3.size(), eaVar.N == 2);
                    arrayList5.add(h10);
                    j9Var6.o = AndroidUtilities.dp(56.0f) + j9Var6.o;
                    if (arrayList3.size() == 1) {
                        i23 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                        h10.g = MessagesController.getInstance(i23).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList J0 = ea.J0(eaVar);
                    j9 h11 = j9.h(1, J0.size(), eaVar.N == 1);
                    arrayList5.add(h11);
                    j9Var6.o = AndroidUtilities.dp(56.0f) + j9Var6.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) J0.get(0);
                    }
                    j9 h12 = j9.h(3, eaVar.s, eaVar.N == 3);
                    arrayList5.add(h12);
                    j9Var6.o = AndroidUtilities.dp(56.0f) + j9Var6.o;
                    if (eaVar.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = eaVar.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i21 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                                    h12.g = MessagesController.getInstance(i21).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i22 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                            h12.g = MessagesController.getInstance(i22).getUser((Long) arrayList.get(0));
                        }
                    }
                    i20 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                    int i43 = MessagesController.getInstance(i20).getStoriesController().N;
                    String string5 = i43 <= 0 ? LocaleController.getString(eaVar.K ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(eaVar.K ? "StoryLiveBlockList" : "StoryBlockList", i43, new Object[0]);
                    int i44 = org.telegram.ui.ActionBar.i6.gc;
                    l9 l9Var = new l9(this, 3);
                    d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
                    arrayList5.add(j9.g(AndroidUtilities.replaceSingleTag(string5, i44, 0, l9Var, d6Var)));
                    j9Var6.o = AndroidUtilities.dp(80.0f) + j9Var6.o;
                }
                if (!eaVar.Z) {
                    if (eaVar.K && !eaVar.L) {
                        if (eaVar.G) {
                            arrayList5.add(j9.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
                            arrayList5.add(j9.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
                            arrayList5.add(j9.g(null));
                            j9Var6.o = AndroidUtilities.dp(12.0f) + j9Var6.o;
                        } else {
                            arrayList5.add(j9.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
                            arrayList5.add(j9.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            j9Var6.o = AndroidUtilities.dp(30.0f) + j9Var6.o;
                        }
                    }
                    if (eaVar.K) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = eaVar.w;
                        j9 j9Var13 = new j9(7, false);
                        j9Var13.c = 2;
                        j9Var13.e = string6;
                        j9Var13.k = z20;
                        arrayList5.add(j9Var13);
                        j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
                    }
                    if (!eaVar.L) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = eaVar.x;
                        j9 j9Var14 = new j9(7, false);
                        j9Var14.c = 0;
                        j9Var14.e = string7;
                        j9Var14.k = z21;
                        arrayList5.add(j9Var14);
                        j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
                    }
                    if (!eaVar.K && !eaVar.L) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = eaVar.y;
                        j9 j9Var15 = new j9(7, false);
                        j9Var15.c = 1;
                        j9Var15.e = string8;
                        j9Var15.k = z22;
                        arrayList5.add(j9Var15);
                        j9Var6.o = AndroidUtilities.dp(50.0f) + j9Var6.o;
                    }
                }
                z18 = eaVar.K;
                String str = "StoryKeepGroupInfo";
                if (!z18 || eaVar.L) {
                    arrayList5.add(j9.g(null));
                    j9Var6.o = AndroidUtilities.dp(12.0f) + j9Var6.o;
                } else if (!eaVar.Z && eaVar.E && eaVar.c0 != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i45 = eaVar.Q;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i45 / 3600, new Object[0]);
                    }
                    arrayList5.add(j9.g(formatPluralString3));
                    j9Var6.o = AndroidUtilities.dp(f7) + j9Var6.o;
                }
                if (eaVar.y || eaVar.K || eaVar.L) {
                    j9Var = j9Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = eaVar.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i19 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                        clientUserId = UserConfig.getInstance(i19).getClientUserId();
                    }
                    long j3 = clientUserId;
                    eaVar.i1().B(j3, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        j9Var2 = j9Var6;
                    } else {
                        j9Var2 = j9Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                ai.e9 b10 = eaVar.i1().B(j3, true).b(((Integer) it3.next()).intValue());
                                if (b10 != null) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(b10.b);
                                }
                                it3 = it4;
                            }
                        } else {
                            sb2.append(LocaleController.formatPluralString("StoriesAlbumCount", hashSet.size(), new Object[0]));
                        }
                    }
                    arrayList5.add(j9.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    j9Var = j9Var2;
                    j9Var.o = AndroidUtilities.dp(50.0f) + j9Var.o;
                }
                if (!eaVar.Z && ((!eaVar.E || eaVar.c0 == null) && !(z19 = eaVar.K) && !eaVar.L)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i46 = eaVar.Q;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i46 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(j9.g(formatPluralString2));
                    j9Var.o = AndroidUtilities.dp(f7) + j9Var.o;
                }
                if (eaVar.y && eaVar.E && eaVar.c0 != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = eaVar.b0;
                    j9 j9Var16 = new j9(9, false);
                    j9Var16.e = string9;
                    j9Var16.d = bitmapDrawable;
                    j9Var16.q = 0;
                    arrayList5.add(j9Var16);
                    j9Var.o = AndroidUtilities.dp(50.0f) + j9Var.o;
                    arrayList5.add(j9.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    j9Var.o = AndroidUtilities.dp(72.0f) + j9Var.o;
                }
                if (eaVar.L) {
                    arrayList5.add(j9.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    j9Var.o = AndroidUtilities.dp(50.0f) + j9Var.o;
                    arrayList5.add(j9.g(null));
                    j9Var.o = AndroidUtilities.dp(52.0f) + j9Var.o;
                }
                if (eaVar.K && eaVar.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    j9 j9Var17 = new j9(8, false);
                    j9Var17.e = string10;
                    arrayList5.add(j9Var17);
                    j9Var.o = AndroidUtilities.dp(40.0f) + j9Var.o;
                    j9 j9Var18 = new j9(10, false);
                    j9Var18.q = 8;
                    arrayList5.add(j9Var18);
                    j9Var.o = AndroidUtilities.dp(75.0f) + j9Var.o;
                    arrayList5.add(j9.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    j9Var.o = AndroidUtilities.dp(50.0f) + j9Var.o;
                }
            }
            z17 = false;
            z16 = true;
            j9 g102 = j9.g(null);
            g102.c = !z16 ? 1 : 2;
            arrayList5.add(g102);
            j9Var6.o = AndroidUtilities.dp(12.0f) + j9Var6.o;
            if (z16) {
            }
            if (z16) {
            }
            f7 = 80.0f;
            if (!eaVar.Z) {
            }
            z18 = eaVar.K;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(j9.g(null));
            j9Var6.o = AndroidUtilities.dp(12.0f) + j9Var6.o;
            if (eaVar.y) {
            }
            j9Var = j9Var6;
            if (!eaVar.Z) {
                if (z19) {
                }
                arrayList5.add(j9.g(formatPluralString2));
                j9Var.o = AndroidUtilities.dp(f7) + j9Var.o;
            }
            if (eaVar.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = eaVar.b0;
                j9 j9Var162 = new j9(9, false);
                j9Var162.e = string92;
                j9Var162.d = bitmapDrawable2;
                j9Var162.q = 0;
                arrayList5.add(j9Var162);
                j9Var.o = AndroidUtilities.dp(50.0f) + j9Var.o;
                arrayList5.add(j9.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                j9Var.o = AndroidUtilities.dp(72.0f) + j9Var.o;
            }
            if (eaVar.L) {
            }
            if (eaVar.K) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                j9 j9Var172 = new j9(8, false);
                j9Var172.e = string102;
                arrayList5.add(j9Var172);
                j9Var.o = AndroidUtilities.dp(40.0f) + j9Var.o;
                j9 j9Var182 = new j9(10, false);
                j9Var182.q = 8;
                arrayList5.add(j9Var182);
                j9Var.o = AndroidUtilities.dp(75.0f) + j9Var.o;
                arrayList5.add(j9.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                j9Var.o = AndroidUtilities.dp(50.0f) + j9Var.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f7 = 80.0f;
        if (!eaVar.Z) {
        }
        z18 = eaVar.K;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(j9.g(null));
        j9Var6.o = AndroidUtilities.dp(12.0f) + j9Var6.o;
        if (eaVar.y) {
        }
        j9Var = j9Var6;
        if (!eaVar.Z) {
        }
        if (eaVar.y) {
        }
        if (eaVar.L) {
        }
        if (eaVar.K) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.I);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        t9Var = this.n;
        if (t9Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.v3 v3Var = this.y;
        if (v3Var == null) {
            return;
        }
        if (ea.l1(this.c, this.d).size() > 0) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new k9(this, 2));
            return;
        }
        if (z10) {
            v3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.u3 u3Var = v3Var.b;
        u3Var.c(null, false, true);
        u3Var.setOnClickListener(null);
        u3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        int i10;
        q9 q9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.d6 d6Var;
        HashSet l1 = ea.l1(this.c, this.d);
        int i11 = this.a;
        ea eaVar = this.W;
        if (i11 == 3) {
            eaVar.s = l1.size();
        } else if (i11 == 4) {
            eaVar.f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            q9Var = this.x;
            ArrayList arrayList4 = q9Var.d;
            arrayList = q9Var.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            q30 q30Var = (q30) arrayList.get(i13);
            if (!l1.contains(Long.valueOf(q30Var.getUid()))) {
                arrayList2.add(q30Var);
            }
            i13++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l4) : messagesController.getChat(l4);
                    if (user != null) {
                        Context context = getContext();
                        d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
                        q30 q30Var2 = new q30(context, user, null, true, d6Var);
                        q30Var2.setOnClickListener(this);
                        arrayList3.add(q30Var2);
                    }
                } else if (((q30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        aa aaVar = q9Var.c;
        ArrayList arrayList5 = aaVar.e;
        ArrayList arrayList6 = aaVar.d;
        ArrayList arrayList7 = aaVar.f;
        ba baVar = (ba) aaVar.n;
        baVar.G = true;
        ArrayList arrayList8 = baVar.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = aaVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((q30) arrayList2.get(i15)).setOnClickListener(null);
        }
        aaVar.c();
        if (z10) {
            aaVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            aaVar.b = animatorSet;
            animatorSet.addListener(new z9(aaVar, arrayList2, i12));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i16 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i16 >= size) {
                    break;
                }
                q30 q30Var3 = (q30) arrayList2.get(i16);
                arrayList5.add(q30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(q30Var3, (Property<q30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var3, (Property<q30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var3, (Property<q30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                q30 q30Var4 = (q30) arrayList3.get(i17);
                arrayList6.add(q30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(q30Var4, (Property<q30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var4, (Property<q30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(q30Var4, (Property<q30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                aaVar.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            aaVar.b = null;
            aaVar.c = false;
            baVar.a.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            aaVar.addView((View) arrayList3.get(i12));
            i12++;
        }
        aaVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        q9 q9Var = this.x;
        if (z10 || this.U || getTranslationX() != 0.0f) {
            this.N = false;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            q9Var.setTranslationY(c10);
        } else if (!this.N || Math.abs(this.O - c10) > 1.0f) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            float translationY = q9Var.getTranslationY();
            this.O = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 25));
            this.P.addListener(new ai.b(this, 18));
            this.P.setInterpolator(new LinearInterpolator());
            this.P.setDuration(180L);
            this.P.start();
        }
        boolean z12 = this.F;
        i9 i9Var = this.E;
        if (!z12) {
            i9Var.setVisibility(8);
            return;
        }
        i9Var.setVisibility(0);
        float f7 = -i9Var.getHeight();
        int i10 = 0;
        while (true) {
            zl0 zl0Var = this.f;
            if (i10 >= zl0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f7 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.Q != z11) {
            this.Q = z11;
            ((org.telegram.ui.ActionBar.g2) i9Var.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        i9Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f7));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q9 q9Var = this.x;
        if (!q9Var.d.contains(view)) {
            return;
        }
        q30 q30Var = (q30) view;
        if (!q30Var.y) {
            q30 q30Var2 = q9Var.e;
            if (q30Var2 != null) {
                q30Var2.a();
                q9Var.e = null;
            }
            q9Var.e = q30Var;
            q30Var.b();
            return;
        }
        q9Var.e = null;
        aa aaVar = q9Var.c;
        ba baVar = (ba) aaVar.n;
        baVar.G = true;
        baVar.d.remove(q30Var);
        q30Var.setOnClickListener(null);
        aaVar.c();
        aaVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        aaVar.b = animatorSet;
        animatorSet.addListener(new ai.z(5, aaVar, q30Var));
        ArrayList arrayList = aaVar.h;
        arrayList.clear();
        arrayList.add(q30Var);
        ArrayList arrayList2 = aaVar.d;
        arrayList2.clear();
        aaVar.e.clear();
        arrayList2.add(q30Var);
        ArrayList arrayList3 = aaVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.ALPHA, 1.0f, 0.0f));
        aaVar.requestLayout();
        long uid = q30Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.c;
            if (!hasNext) {
                arrayList4.remove(Long.valueOf(uid));
                f(true);
                e(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        ea eaVar = this.W;
        i12 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardHeight;
            this.T = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
        zl0 zl0Var = this.f;
        v9 v9Var = this.r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
            int i14 = 2;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.x.J) > zl0Var.getPaddingTop()) {
                ji.o oVar = new ji.o(getContext(), 2, 0.7f);
                oVar.a = 1;
                oVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                v9Var.setTranslationY(z15 ? this.T : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                view.setTranslationY(z16 ? this.T : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                float f7 = z12 ? this.T : -this.T;
                ValueAnimator valueAnimator = v9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    v9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                v9Var.d = ofFloat;
                ofFloat.addUpdateListener(new u9(v9Var, 1));
                v9Var.d.addListener(new ai.b(v9Var, 19));
                v9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = v9Var.d;
                tr trVar = org.telegram.ui.ActionBar.p1.w;
                valueAnimator2.setInterpolator(trVar);
                v9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                view.setTranslationY(z13 ? this.T : -this.T);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(trVar).withEndAction(new l9(this, i14)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
            this.V = z14;
        }
        zl0Var.setPadding(0, 0, 0, v9Var.getMeasuredHeight());
    }
}
