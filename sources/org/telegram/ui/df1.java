package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class df1 extends org.telegram.ui.ActionBar.o2 {
    public bf1 a;
    public org.telegram.ui.Components.wk0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void T(df1 df1Var, int i9) {
        df1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(df1Var.c, i9);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = df1Var.getMessagesController().getInputPeer(df1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i9;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        df1Var.getConnectionsManager().sendRequest(updatenotifysettings, new ih.q5(5));
    }

    public final void U() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new cf1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.c);
        int i9 = 0;
        if (topics != null) {
            int i10 = 0;
            while (i9 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i9).id))) {
                    arrayList2.add(new cf1(2, topics.get(i9)));
                    i10 = 1;
                }
                i9++;
            }
            i9 = i10;
        }
        if (i9 != 0) {
            arrayList2.add(new cf1(3, null));
            arrayList2.add(new cf1(4, null));
        }
        arrayList2.add(new cf1(3, null));
        bf1 bf1Var = this.a;
        if (bf1Var != null) {
            bf1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 0));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.wk0(context, null);
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.m = false;
        this.b.setItemAnimator(nVar);
        this.b.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var = this.b;
        bf1 bf1Var = new bf1(this);
        this.a = bf1Var;
        wk0Var.setAdapter(bf1Var);
        this.b.setOnItemClickListener(new af1(this));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        U();
        return super.onFragmentCreate();
    }
}
