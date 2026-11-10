package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fa1 extends org.telegram.ui.ActionBar.f2 {
    public da1 a;
    public org.telegram.ui.Components.pj0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void Z(fa1 fa1Var, int i7) {
        org.telegram.messenger.et etVar = fa1Var.getNotificationsController().g0;
        etVar.getClass();
        String v = org.telegram.messenger.dt.v(fa1Var.c, i7, true);
        etVar.b().edit().remove("notify2_" + v).remove("custom_" + v).remove("notifyuntil_" + v).remove("content_preview_" + v).remove("silent_" + v).remove("stories_" + v).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = fa1Var.getMessagesController().j1(fa1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i7;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        fa1Var.getConnectionsManager().sendRequest(updatenotifysettings, new di.v5(9));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new ea1(1, null));
        ArrayList l10 = getMessagesController().q7.l(-this.c);
        int i7 = 0;
        if (l10 != null) {
            int i10 = 0;
            while (i7 < l10.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).id))) {
                    arrayList2.add(new ea1(2, (TLRPC.TL_forumTopic) l10.get(i7)));
                    i10 = 1;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            arrayList2.add(new ea1(3, null));
            arrayList2.add(new ea1(4, null));
        }
        arrayList2.add(new ea1(3, null));
        da1 da1Var = this.a;
        if (da1Var != null) {
            da1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 16));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747912, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.b;
        da1 da1Var = new da1(this);
        this.a = da1Var;
        pj0Var2.setAdapter(da1Var);
        this.b.setOnItemClickListener(new ca1(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
