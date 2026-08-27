package lh;

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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final w8 A;
    public boolean B;
    public org.telegram.ui.ActionBar.b2 C;
    public long D;
    public String E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public boolean I;
    public boolean J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final /* synthetic */ q9 S;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final zk0 f;
    public final f2.k0 h;
    public final f9 n;
    public final i9 r;
    public final View s;
    public final d v;
    public final d w;
    public final c9 x;
    public final org.telegram.ui.Cells.s3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(q9 q9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var6;
        org.telegram.ui.ActionBar.c6 c6Var7;
        org.telegram.ui.ActionBar.c6 c6Var8;
        org.telegram.ui.ActionBar.c6 c6Var9;
        this.S = q9Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.N = -1;
        c6Var = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, c6Var);
        this.y = s3Var;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        c9 c9Var = new c9(this, context, c6Var2, new z8(this, 4));
        this.x = c9Var;
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        c9Var.setBackgroundColor(q9Var.getThemedColor(i12));
        c9Var.setOnSearchTextChange(new a9(this, 3));
        c6Var3 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        w8 w8Var = new w8(context, c6Var3);
        this.A = w8Var;
        w8Var.h = new z8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        c6Var4 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        zk0 zk0Var = new zk0(context, c6Var4);
        this.f = zk0Var;
        zk0Var.setClipToPadding(false);
        zk0Var.setTranslateSelector(true);
        c6Var5 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        f9 f9Var = new f9(this, context, c6Var5, c9Var, new jh.u3(q9Var, 2));
        this.n = f9Var;
        zk0Var.setAdapter(f9Var);
        f9Var.h = zk0Var;
        f2.k0 k0Var = new f2.k0();
        this.h = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setOnScrollListener(new d9(this, 0));
        zk0Var.setOnItemClickListener(new jh.z1(4, this, context));
        frameLayout.addView(zk0Var, h7.z5.c(-1.0f, -1));
        e9 e9Var = new e9(this);
        e9Var.n(350L);
        e9Var.o(er.h);
        e9Var.C = false;
        e9Var.m = false;
        zk0Var.setItemAnimator(e9Var);
        frameLayout.addView(c9Var, h7.z5.e(-1, -2, 55));
        frameLayout.addView(s3Var, h7.z5.e(-1, 32, 55));
        addView(w8Var, h7.z5.e(-1, -2, 55));
        i9 i9Var = new i9(this, context);
        this.r = i9Var;
        i9Var.setClickable(true);
        i9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.e3) q9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.e3) q9Var).backgroundPaddingLeft;
        i9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        c6Var6 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        i9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var6));
        c6Var7 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        d dVar = new d(context, c6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new y8(this, 0));
        dVar.e();
        i9Var.addView(dVar, h7.z5.q(-1, 48, 87));
        c6Var8 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        d dVar2 = new d(context, c6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new y8(this, 1));
        dVar2.e();
        i9Var.addView(dVar2, h7.z5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        c6Var9 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var9));
        addView(view, h7.z5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(i9Var, h7.z5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.e3) this.S).currentAccount;
        arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
        int i11 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i11 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i11);
            if (!((Boolean) hVar.n(i11)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
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
        q9 q9Var = this.S;
        if (i10 == 4) {
            arrayList.addAll(q9Var.d);
            hashMap.putAll(q9Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(q9Var.F);
        } else if (i10 == 1) {
            ArrayList J0 = q9.J0(q9Var);
            for (int i11 = 0; i11 < J0.size(); i11 = com.google.android.recaptcha.internal.a.f(((TLRPC.User) J0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(q9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(q9Var.n);
            hashMap.putAll(q9Var.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        c9 c9Var = this.x;
        c9Var.setText("");
        c9Var.setVisibility(i10 == 0 ? 8 : 0);
        c9Var.G = true;
        this.E = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        zk0 zk0Var = this.f;
        if (i12 != 0) {
            zk0Var.u0(0);
        }
        zk0Var.requestLayout();
        this.N = -1;
    }

    public final float c() {
        int i10 = 0;
        float f10 = -i0.a.d(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.F), 0);
        while (true) {
            zk0 zk0Var = this.f;
            if (i10 >= zk0Var.getChildCount()) {
                return f10;
            }
            View childAt = zk0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z10 = i11 == 1 || i11 == 2;
        q9 q9Var = this.S;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j11 != 0) {
                    if (!z10 || user.contact) {
                        arrayList.add(Long.valueOf(j11));
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    this.c.remove(Long.valueOf(j11));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j10), arrayList);
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.x.G = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            c6Var2 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var2);
            alertDialog$Builder.a.P = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        c6Var = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, c6Var);
        alertDialog$Builder2.a.P = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new c3.f(this, j10, arrayList, 4));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (b2Var = this.C) == null || this.D != chatFull.id) {
            return;
        }
        b2Var.c(350L);
        this.C = null;
        this.D = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10;
        int i11 = this.a;
        q9 q9Var = this.S;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (q9Var.H) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (q9Var.V) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = q9Var.E;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
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
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        i9 i9Var = this.r;
        if (i11 == 3) {
            int size = q9.l1(arrayList, this.d).size();
            q9Var.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            i9Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i11 != 6) {
            if (i11 == 4) {
                int size2 = q9.l1(q9Var.d, q9Var.e).size();
                q9Var.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                i9Var.b(false, z10);
                dVar2.c(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
        i10 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
        jh.s6 storiesController = MessagesController.getInstance(i10).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i12 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i12);
                ((Boolean) hVar.n(i12)).getClass();
                storiesController.L.contains(Long.valueOf(j10));
                i12++;
            }
        } else {
            dVar2.c(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        q9 q9Var = this.S;
        ArrayList arrayList2 = q9Var.F;
        HashMap hashMap = q9Var.r;
        ArrayList arrayList3 = q9Var.n;
        ArrayList arrayList4 = q9Var.h;
        HashMap hashMap2 = q9Var.e;
        ArrayList arrayList5 = q9Var.d;
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
        if (this.a == 3 && (q9Var.J != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.N;
                if (i11 != -1) {
                    q9Var.J = i11;
                }
            } else {
                this.N = q9Var.J;
                q9Var.J = 3;
            }
        }
        HashSet l1 = q9.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.H;
            if (i12 >= arrayList.size()) {
                break;
            }
            x8 x8Var = (x8) arrayList.get(i12);
            if (x8Var != null) {
                int i13 = x8Var.i;
                if (i13 > 0) {
                    x8Var.k = q9Var.J == i13;
                    x8Var.l = false;
                } else {
                    TLRPC.User user = x8Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        x8Var.k = contains;
                        x8Var.l = !contains && l1.contains(Long.valueOf(x8Var.g.id));
                    } else {
                        TLRPC.Chat chat = x8Var.h;
                        if (chat != null) {
                            x8Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            x8Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            zk0 zk0Var = this.f;
            if (i14 >= zk0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = zk0Var.getChildAt(i14);
            if ((childAt instanceof p9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                x8 x8Var2 = (x8) arrayList.get(R);
                p9 p9Var = (p9) childAt;
                p9Var.c(x8Var2.k || x8Var2.l, z10);
                TLRPC.Chat chat2 = x8Var2.h;
                if (chat2 != null) {
                    p9Var.b(q9.d1(q9Var, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (x8Var2.l && !x8Var2.k) {
                        r8 = 0.5f;
                    }
                    p9Var.b(r8, z10);
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
    /* JADX WARN: Removed duplicated region for block: B:177:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0be7  */
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
        f9 f9Var;
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
        float f10;
        boolean z18;
        x8 x8Var;
        boolean z19;
        String formatPluralString2;
        int i19;
        long clientUserId;
        x8 x8Var2;
        String formatPluralString3;
        int i20;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        q9 q9Var = this.S;
        ArrayList arrayList = q9Var.n;
        ArrayList arrayList2 = q9Var.d;
        ArrayList arrayList3 = q9Var.h;
        HashSet hashSet = q9Var.v;
        ArrayList arrayList4 = this.G;
        arrayList4.clear();
        ArrayList arrayList5 = this.H;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i26 = this.a;
        org.telegram.ui.Cells.s3 s3Var = this.y;
        if (i26 != 0) {
            w8 w8Var = this.A;
            if (i26 == 1) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.e).c(0.0f, false);
                arrayList5.add(x8.d());
                arrayList5.add(x8.c());
                arrayList5.size();
                arrayList5.add(x8.e());
                arrayList5.add(x8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 2) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.e).c(0.0f, false);
                arrayList5.add(x8.d());
                arrayList5.add(x8.c());
                arrayList5.size();
                arrayList5.add(x8.e());
                arrayList5.add(x8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 3) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.e).c(0.0f, false);
                arrayList5.add(x8.d());
                arrayList5.add(x8.c());
                arrayList5.size();
                arrayList5.add(x8.e());
                arrayList5.add(x8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 5) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                w8Var.d(q9Var.K);
                ((org.telegram.ui.ActionBar.g2) w8Var.e).c(0.0f, false);
                arrayList5.add(x8.d());
                arrayList5.add(x8.c());
                arrayList5.size();
                arrayList5.add(x8.e());
                arrayList5.add(x8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 6) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.e).c(0.0f, false);
                arrayList5.add(x8.d());
                arrayList5.add(x8.c());
                arrayList5.size();
                arrayList5.add(x8.e());
                arrayList5.add(x8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 4) {
                w8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                w8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) w8Var.e).c(0.0f, false);
                arrayList5.add(x8.d());
                arrayList5.add(x8.c());
                arrayList5.size();
                arrayList5.add(x8.e());
                arrayList5.add(x8.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.B = true;
                boolean isEmpty = TextUtils.isEmpty(this.E);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.E).toLowerCase();
                    int i27 = this.a;
                    ArrayList Y0 = i27 == 5 ? q9.Y0(q9Var) : q9.Z0(q9Var, i27 == 1 || i27 == 2, q9Var.U && (i27 == 3 || i27 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = q9.l1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.F;
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
                                x8 i31 = x8.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
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
                                    float f11 = dp;
                                    x8 x8Var3 = new x8(3, true);
                                    x8Var3.h = chat;
                                    x8Var3.k = containsKey2;
                                    int i33 = this.a;
                                    x8Var3.m = i33 == 2 || i33 == 4;
                                    arrayList5.add(x8Var3);
                                    dp = f11 + AndroidUtilities.dp(56.0f);
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
                                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.y1.x(" ", lowerCase, lowerCase3)) {
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
                                        if (!lowerCase4.startsWith(lowerCase) && !org.telegram.messenger.y1.x(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !org.telegram.messenger.y1.x(" ", lowerCase, lowerCase5)) {
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
                                        x8 i37 = x8.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i38 = this.a;
                                        i37.m = i38 == 2 || i38 == 4;
                                        arrayList5.add(i37);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        x8 x8Var4 = new x8(3, true);
                                        x8Var4.h = chat3;
                                        x8Var4.k = containsKey3;
                                        int i39 = this.a;
                                        if (i39 != 2 && i39 != 4) {
                                            z14 = false;
                                            x8Var4.m = z14;
                                            arrayList5.add(x8Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i34 = i11 + 1;
                                        }
                                        z14 = true;
                                        x8Var4.m = z14;
                                        arrayList5.add(x8Var4);
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
                            arrayList5.add(new x8(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        zk0 zk0Var = this.f;
                        if (zk0Var != null) {
                            int measuredHeight = (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()) - zk0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.P : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f12 = dp3 - dp;
                        if (f12 > 0.0f) {
                            x8 x8Var5 = new x8(-1, false);
                            x8Var5.p = (int) f12;
                            arrayList5.add(x8Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                f9Var = this.n;
                if (f9Var != null) {
                    if (!z10 || q9Var.J == 0) {
                        f9Var.l();
                    } else {
                        f9Var.E(arrayList4, arrayList5);
                    }
                }
                this.e.invalidate();
            }
            dp = dp2;
            boolean isEmpty2 = TextUtils.isEmpty(this.E);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            f9Var = this.n;
            if (f9Var != null) {
            }
            this.e.invalidate();
        }
        this.B = false;
        s3Var.setVisibility(8);
        i14 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i14).getStoriesController().T;
        x8 x8Var6 = new x8(-1, false);
        x8Var6.o = 24;
        arrayList5.add(x8Var6);
        if (q9Var.H) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            x8 x8Var7 = new x8(11, false);
            x8Var7.e = string;
            arrayList5.add(x8Var7);
            x8Var6.o = AndroidUtilities.dp(72.0f) + x8Var6.o;
        } else if (q9Var.B && (q9Var.V || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = q9Var.V ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (q9Var.G) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i40 = q9Var.M;
                formatPluralString = i40 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i40 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            x8 x8Var8 = new x8(4, false);
            x8Var8.e = string2;
            x8Var8.f = formatPluralString;
            arrayList5.add(x8Var8);
            x8Var6.o = AndroidUtilities.dp(72.0f) + x8Var6.o;
        } else {
            String string3 = LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            x8 x8Var9 = new x8(8, false);
            x8Var9.e = string3;
            arrayList5.add(x8Var9);
            x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
            TLRPC.InputPeer inputPeer = q9Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i15 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                x8 i41 = x8.i(UserConfig.getInstance(i15).getCurrentUser(), false, false);
                i41.n = true;
                arrayList5.add(i41);
                x8Var6.o = AndroidUtilities.dp(62.0f) + x8Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i18 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                x8 i42 = x8.i(MessagesController.getInstance(i18).getUser(Long.valueOf(q9Var.c.user_id)), false, false);
                i42.n = true;
                arrayList5.add(i42);
                x8Var6.o = AndroidUtilities.dp(62.0f) + x8Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i17 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(q9Var.c.channel_id));
                    x8 x8Var10 = new x8(3, true);
                    x8Var10.h = chat4;
                    x8Var10.k = false;
                    x8Var10.n = true;
                    arrayList5.add(x8Var10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    x8Var6.o = AndroidUtilities.dp(104.0f) + x8Var6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i16 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i16).getChat(Long.valueOf(q9Var.c.chat_id));
                    x8 x8Var11 = new x8(3, true);
                    x8Var11.h = chat5;
                    x8Var11.k = false;
                    x8Var11.n = true;
                    arrayList5.add(x8Var11);
                    x8Var6.o = AndroidUtilities.dp(104.0f) + x8Var6.o;
                    z17 = false;
                }
                z16 = false;
                x8 g10 = x8.g(null);
                g10.c = !z16 ? 1 : 2;
                arrayList5.add(g10);
                x8Var6.o = AndroidUtilities.dp(12.0f) + x8Var6.o;
                if (z16) {
                    String string4 = LocaleController.getString(q9Var.G ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    x8 x8Var12 = new x8(8, false);
                    x8Var12.e = string4;
                    arrayList5.add(x8Var12);
                    x8Var6.o = AndroidUtilities.dp(40.0f) + x8Var6.o;
                }
                if (z16 || q9Var.H) {
                    f10 = 80.0f;
                } else {
                    x8 h = x8.h(4, q9Var.f, q9Var.J == 4);
                    arrayList5.add(h);
                    x8Var6.o = AndroidUtilities.dp(56.0f) + x8Var6.o;
                    f10 = 80.0f;
                    if (q9Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = q9Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i24 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                    h.g = MessagesController.getInstance(i24).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i25 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            h.g = MessagesController.getInstance(i25).getUser((Long) arrayList2.get(0));
                        }
                    }
                    x8 h10 = x8.h(2, arrayList3.size(), q9Var.J == 2);
                    arrayList5.add(h10);
                    x8Var6.o = AndroidUtilities.dp(56.0f) + x8Var6.o;
                    if (arrayList3.size() == 1) {
                        i23 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                        h10.g = MessagesController.getInstance(i23).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList J0 = q9.J0(q9Var);
                    x8 h11 = x8.h(1, J0.size(), q9Var.J == 1);
                    arrayList5.add(h11);
                    x8Var6.o = AndroidUtilities.dp(56.0f) + x8Var6.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) J0.get(0);
                    }
                    x8 h12 = x8.h(3, q9Var.s, q9Var.J == 3);
                    arrayList5.add(h12);
                    x8Var6.o = AndroidUtilities.dp(56.0f) + x8Var6.o;
                    if (q9Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = q9Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i21 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                    h12.g = MessagesController.getInstance(i21).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i22 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                            h12.g = MessagesController.getInstance(i22).getUser((Long) arrayList.get(0));
                        }
                    }
                    i20 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    int i43 = MessagesController.getInstance(i20).getStoriesController().N;
                    String string5 = i43 <= 0 ? LocaleController.getString(q9Var.G ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(q9Var.G ? "StoryLiveBlockList" : "StoryBlockList", i43, new Object[0]);
                    int i44 = org.telegram.ui.ActionBar.g6.gc;
                    z8 z8Var = new z8(this, 3);
                    c6Var = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                    arrayList5.add(x8.g(AndroidUtilities.replaceSingleTag(string5, i44, 0, z8Var, c6Var)));
                    x8Var6.o = AndroidUtilities.dp(80.0f) + x8Var6.o;
                }
                if (!q9Var.V) {
                    if (q9Var.G && !q9Var.H) {
                        if (q9Var.C) {
                            arrayList5.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
                            arrayList5.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
                            arrayList5.add(x8.g(null));
                            x8Var6.o = AndroidUtilities.dp(12.0f) + x8Var6.o;
                        } else {
                            arrayList5.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
                            arrayList5.add(x8.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            x8Var6.o = AndroidUtilities.dp(30.0f) + x8Var6.o;
                        }
                    }
                    if (q9Var.G) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = q9Var.w;
                        x8 x8Var13 = new x8(7, false);
                        x8Var13.c = 2;
                        x8Var13.e = string6;
                        x8Var13.k = z20;
                        arrayList5.add(x8Var13);
                        x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
                    }
                    if (!q9Var.H) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = q9Var.x;
                        x8 x8Var14 = new x8(7, false);
                        x8Var14.c = 0;
                        x8Var14.e = string7;
                        x8Var14.k = z21;
                        arrayList5.add(x8Var14);
                        x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
                    }
                    if (!q9Var.G && !q9Var.H) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = q9Var.y;
                        x8 x8Var15 = new x8(7, false);
                        x8Var15.c = 1;
                        x8Var15.e = string8;
                        x8Var15.k = z22;
                        arrayList5.add(x8Var15);
                        x8Var6.o = AndroidUtilities.dp(50.0f) + x8Var6.o;
                    }
                }
                z18 = q9Var.G;
                String str = "StoryKeepGroupInfo";
                if (!z18 || q9Var.H) {
                    arrayList5.add(x8.g(null));
                    x8Var6.o = AndroidUtilities.dp(12.0f) + x8Var6.o;
                } else if (!q9Var.V && q9Var.A && q9Var.Y != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i45 = q9Var.M;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i45 / 3600, new Object[0]);
                    }
                    arrayList5.add(x8.g(formatPluralString3));
                    x8Var6.o = AndroidUtilities.dp(f10) + x8Var6.o;
                }
                if (q9Var.y || q9Var.G || q9Var.H) {
                    x8Var = x8Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = q9Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i19 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i19).getClientUserId();
                    }
                    long j10 = clientUserId;
                    q9Var.i1().B(j10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        x8Var2 = x8Var6;
                    } else {
                        x8Var2 = x8Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                jh.k6 b10 = q9Var.i1().B(j10, true).b(((Integer) it3.next()).intValue());
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
                    arrayList5.add(x8.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    x8Var = x8Var2;
                    x8Var.o = AndroidUtilities.dp(50.0f) + x8Var.o;
                }
                if (!q9Var.V && ((!q9Var.A || q9Var.Y == null) && !(z19 = q9Var.G) && !q9Var.H)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i46 = q9Var.M;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i46 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(x8.g(formatPluralString2));
                    x8Var.o = AndroidUtilities.dp(f10) + x8Var.o;
                }
                if (q9Var.y && q9Var.A && q9Var.Y != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = q9Var.X;
                    x8 x8Var16 = new x8(9, false);
                    x8Var16.e = string9;
                    x8Var16.d = bitmapDrawable;
                    x8Var16.q = 0;
                    arrayList5.add(x8Var16);
                    x8Var.o = AndroidUtilities.dp(50.0f) + x8Var.o;
                    arrayList5.add(x8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    x8Var.o = AndroidUtilities.dp(72.0f) + x8Var.o;
                }
                if (q9Var.H) {
                    arrayList5.add(x8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    x8Var.o = AndroidUtilities.dp(50.0f) + x8Var.o;
                    arrayList5.add(x8.g(null));
                    x8Var.o = AndroidUtilities.dp(52.0f) + x8Var.o;
                }
                if (q9Var.G && q9Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    x8 x8Var17 = new x8(8, false);
                    x8Var17.e = string10;
                    arrayList5.add(x8Var17);
                    x8Var.o = AndroidUtilities.dp(40.0f) + x8Var.o;
                    x8 x8Var18 = new x8(10, false);
                    x8Var18.q = 8;
                    arrayList5.add(x8Var18);
                    x8Var.o = AndroidUtilities.dp(75.0f) + x8Var.o;
                    arrayList5.add(x8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    x8Var.o = AndroidUtilities.dp(50.0f) + x8Var.o;
                }
            }
            z17 = false;
            z16 = true;
            x8 g102 = x8.g(null);
            g102.c = !z16 ? 1 : 2;
            arrayList5.add(g102);
            x8Var6.o = AndroidUtilities.dp(12.0f) + x8Var6.o;
            if (z16) {
            }
            if (z16) {
            }
            f10 = 80.0f;
            if (!q9Var.V) {
            }
            z18 = q9Var.G;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(x8.g(null));
            x8Var6.o = AndroidUtilities.dp(12.0f) + x8Var6.o;
            if (q9Var.y) {
            }
            x8Var = x8Var6;
            if (!q9Var.V) {
                if (z19) {
                }
                arrayList5.add(x8.g(formatPluralString2));
                x8Var.o = AndroidUtilities.dp(f10) + x8Var.o;
            }
            if (q9Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = q9Var.X;
                x8 x8Var162 = new x8(9, false);
                x8Var162.e = string92;
                x8Var162.d = bitmapDrawable2;
                x8Var162.q = 0;
                arrayList5.add(x8Var162);
                x8Var.o = AndroidUtilities.dp(50.0f) + x8Var.o;
                arrayList5.add(x8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                x8Var.o = AndroidUtilities.dp(72.0f) + x8Var.o;
            }
            if (q9Var.H) {
            }
            if (q9Var.G) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                x8 x8Var172 = new x8(8, false);
                x8Var172.e = string102;
                arrayList5.add(x8Var172);
                x8Var.o = AndroidUtilities.dp(40.0f) + x8Var.o;
                x8 x8Var182 = new x8(10, false);
                x8Var182.q = 8;
                arrayList5.add(x8Var182);
                x8Var.o = AndroidUtilities.dp(75.0f) + x8Var.o;
                arrayList5.add(x8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                x8Var.o = AndroidUtilities.dp(50.0f) + x8Var.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f10 = 80.0f;
        if (!q9Var.V) {
        }
        z18 = q9Var.G;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(x8.g(null));
        x8Var6.o = AndroidUtilities.dp(12.0f) + x8Var6.o;
        if (q9Var.y) {
        }
        x8Var = x8Var6;
        if (!q9Var.V) {
        }
        if (q9Var.y) {
        }
        if (q9Var.H) {
        }
        if (q9Var.G) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.E);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        f9Var = this.n;
        if (f9Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.s3 s3Var = this.y;
        if (s3Var == null) {
            return;
        }
        if (q9.l1(this.c, this.d).size() > 0) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new y8(this, 2));
            return;
        }
        if (z10) {
            s3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.r3 r3Var = s3Var.b;
        r3Var.c(null, false, true);
        r3Var.setOnClickListener(null);
        r3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        int i10;
        c9 c9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.c6 c6Var;
        HashSet l1 = q9.l1(this.c, this.d);
        int i11 = this.a;
        q9 q9Var = this.S;
        if (i11 == 3) {
            q9Var.s = l1.size();
        } else if (i11 == 4) {
            q9Var.f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            c9Var = this.x;
            ArrayList arrayList4 = c9Var.d;
            arrayList = c9Var.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            a30 a30Var = (a30) arrayList.get(i13);
            if (!l1.contains(Long.valueOf(a30Var.getUid()))) {
                arrayList2.add(a30Var);
            }
            i13++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l10) : messagesController.getChat(l10);
                    if (user != null) {
                        Context context = getContext();
                        c6Var = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                        a30 a30Var2 = new a30(context, user, null, true, c6Var);
                        a30Var2.setOnClickListener(this);
                        arrayList3.add(a30Var2);
                    }
                } else if (((a30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        gg.k kVar = c9Var.c;
        ArrayList arrayList5 = kVar.e;
        ArrayList arrayList6 = kVar.d;
        ArrayList arrayList7 = kVar.f;
        n9 n9Var = (n9) kVar.n;
        n9Var.C = true;
        ArrayList arrayList8 = n9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = kVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((a30) arrayList2.get(i15)).setOnClickListener(null);
        }
        kVar.c();
        if (z10) {
            kVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            kVar.b = animatorSet;
            animatorSet.addListener(new m9(kVar, arrayList2, i12));
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
                a30 a30Var3 = (a30) arrayList2.get(i16);
                arrayList5.add(a30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                a30 a30Var4 = (a30) arrayList3.get(i17);
                arrayList6.add(a30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                kVar.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            kVar.b = null;
            kVar.c = false;
            n9Var.a.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            kVar.addView((View) arrayList3.get(i12));
            i12++;
        }
        kVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.I;
        int i10 = 8;
        boolean z11 = false;
        c9 c9Var = this.x;
        if (z10 || this.Q || getTranslationX() != 0.0f) {
            this.J = false;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            c9Var.setTranslationY(c10);
        } else if (!this.J || Math.abs(this.K - c10) > 1.0f) {
            this.J = true;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            float translationY = c9Var.getTranslationY();
            this.K = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new m2(this, i10));
            this.L.addListener(new ag.r1(this, 29));
            this.L.setInterpolator(new LinearInterpolator());
            this.L.setDuration(180L);
            this.L.start();
        }
        boolean z12 = this.B;
        w8 w8Var = this.A;
        if (!z12) {
            w8Var.setVisibility(8);
            return;
        }
        w8Var.setVisibility(0);
        float f10 = -w8Var.getHeight();
        int i11 = 0;
        while (true) {
            zk0 zk0Var = this.f;
            if (i11 >= zk0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = zk0Var.getChildAt(i11);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i11++;
        }
        if (this.M != z11) {
            this.M = z11;
            ((org.telegram.ui.ActionBar.g2) w8Var.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        w8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.S).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c9 c9Var = this.x;
        if (!c9Var.d.contains(view)) {
            return;
        }
        a30 a30Var = (a30) view;
        if (!a30Var.y) {
            a30 a30Var2 = c9Var.e;
            if (a30Var2 != null) {
                a30Var2.a();
                c9Var.e = null;
            }
            c9Var.e = a30Var;
            a30Var.b();
            return;
        }
        c9Var.e = null;
        gg.k kVar = c9Var.c;
        n9 n9Var = (n9) kVar.n;
        n9Var.C = true;
        n9Var.d.remove(a30Var);
        a30Var.setOnClickListener(null);
        kVar.c();
        kVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        kVar.b = animatorSet;
        animatorSet.addListener(new ag.x1(9, kVar, a30Var));
        ArrayList arrayList = kVar.h;
        arrayList.clear();
        arrayList.add(a30Var);
        ArrayList arrayList2 = kVar.d;
        arrayList2.clear();
        kVar.e.clear();
        arrayList2.add(a30Var);
        ArrayList arrayList3 = kVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        kVar.requestLayout();
        long uid = a30Var.getUid();
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
        i10 = ((org.telegram.ui.ActionBar.e3) this.S).currentAccount;
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
        q9 q9Var = this.S;
        i12 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardHeight;
            this.P = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.R;
        z10 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
        zk0 zk0Var = this.f;
        i9 i9Var = this.r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
            int i14 = 2;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.x.F) > zk0Var.getPaddingTop()) {
                sh.n nVar = new sh.n(getContext(), 2, 0.7f);
                nVar.a = 1;
                nVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z15 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                i9Var.setTranslationY(z15 ? this.P : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                view.setTranslationY(z16 ? this.P : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                float f10 = z12 ? this.P : -this.P;
                ValueAnimator valueAnimator = i9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                i9Var.d = ofFloat;
                ofFloat.addUpdateListener(new g9(i9Var, 1));
                i9Var.d.addListener(new h9(i9Var, 0));
                i9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = i9Var.d;
                er erVar = org.telegram.ui.ActionBar.p1.w;
                valueAnimator2.setInterpolator(erVar);
                i9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                view.setTranslationY(z13 ? this.P : -this.P);
                this.Q = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(erVar).withEndAction(new z8(this, i14)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
            this.R = z14;
        }
        zk0Var.setPadding(0, 0, 0, i9Var.getMeasuredHeight());
    }
}
