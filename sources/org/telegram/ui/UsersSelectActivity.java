package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.b5 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public int G;
    public final ArrayList H;
    public boolean I;
    public boolean J;
    public a0.h K;
    public ArrayList L;
    public org.telegram.ui.Components.o30 M;
    public int N;
    public int O;
    public org.telegram.ui.ActionBar.x1 a;
    public mh1 b;
    public kg.f c;
    public org.telegram.ui.Components.rl0 d;
    public org.telegram.ui.Components.u00 e;
    public org.telegram.ui.Components.w60 f;
    public lh1 h;
    public jh1 n;
    public org.telegram.ui.Components.a20 r;
    public FrameLayout.LayoutParams s;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z4) {
        super(null);
        this.K = new a0.h();
        this.L = new ArrayList();
        this.F = z4;
        this.G = i10;
        this.H = arrayList;
        this.x = 0;
        this.D = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(UsersSelectActivity usersSelectActivity, Context context, View view, int i10) {
        long j10;
        UsersSelectActivity usersSelectActivity2;
        org.telegram.ui.Components.kp kpVar;
        a0.h hVar = usersSelectActivity.K;
        if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            boolean z4 = object instanceof String;
            if (z4) {
                j10 = -9223372036854775807L;
                int i11 = 4;
                if (usersSelectActivity.x == 2) {
                    if (i10 == 1) {
                        j10 = -9223372036854775800L;
                        i11 = 1;
                    } else if (i10 != 2 || usersSelectActivity.E) {
                        if (i10 != (!usersSelectActivity.E ? 1 : 0) + 2) {
                            i11 = 8;
                        }
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = -9223372036854775799L;
                        i11 = 2;
                    }
                    kpVar = f4Var.d;
                    if (kpVar == null ? kpVar.a.q : f4Var.E) {
                        usersSelectActivity.G |= i11;
                    } else {
                        usersSelectActivity.G &= ~i11;
                    }
                } else {
                    if (usersSelectActivity.F) {
                        if (i10 == 1) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                            j10 = Long.MIN_VALUE;
                        } else if (i10 == 2) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        } else if (i10 == 3) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            j10 = -9223372036854775806L;
                        } else if (i10 == 4) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                            j10 = -9223372036854775805L;
                        } else {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                            j10 = -9223372036854775804L;
                        }
                    } else if (i10 == 1) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                        j10 = -9223372036854775803L;
                    } else if (i10 == 2) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                        j10 = -9223372036854775802L;
                    } else {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                        j10 = -9223372036854775801L;
                    }
                    kpVar = f4Var.d;
                    if (kpVar == null ? kpVar.a.q : f4Var.E) {
                    }
                }
            } else if (object instanceof TLRPC.User) {
                j10 = ((TLRPC.User) object).id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j10 = -chat.id;
                if (usersSelectActivity.x == 1 && !ChatObject.canUserDoAdminAction(chat, 13)) {
                    org.telegram.messenger.y3.s(R.string.NeedAdminRightForSetAutoDeleteTimer, org.telegram.ui.Components.qc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z10 = hVar.h(j10) >= 0;
            if (z10) {
                usersSelectActivity.b.b((org.telegram.ui.Components.o30) hVar.f(j10));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z4 && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    eg.v0 v0Var = new eg.v0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                    v0Var.t0 = usersSelectActivity.w;
                    usersSelectActivity.showDialog(v0Var);
                    return;
                }
                usersSelectActivity2 = usersSelectActivity;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity2.J);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity2.J);
                }
                org.telegram.ui.Components.o30 o30Var = new org.telegram.ui.Components.o30(usersSelectActivity2.c.getContext(), object);
                usersSelectActivity2.b.a(o30Var, true);
                o30Var.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.Y();
            if (usersSelectActivity2.J || usersSelectActivity2.I) {
                AndroidUtilities.showKeyboard(usersSelectActivity2.c);
            } else {
                f4Var.c(!z10, true);
            }
            if (usersSelectActivity2.c.length() > 0) {
                usersSelectActivity2.c.setText((CharSequence) null);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r4.equals("existing_chats") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r4.equals("new_chats") != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        long j10;
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                Object object = f4Var.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    j10 = -9223372036854775800L;
                    switch (str.hashCode()) {
                        case -1716307998:
                            str.equals("archived");
                            j10 = -9223372036854775801L;
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                j10 = -9223372036854775806L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                j10 = -9223372036854775807L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                j10 = Long.MIN_VALUE;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -268161860:
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                j10 = -9223372036854775804L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                j10 = -9223372036854775802L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                j10 = -9223372036854775803L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 151051367:
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                j10 = -9223372036854775805L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        default:
                            j10 = -9223372036854775801L;
                            break;
                    }
                } else {
                    j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j10 != 0) {
                    f4Var.c(this.K.h(j10) >= 0, true);
                    f4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void X() {
        a0.h hVar = this.K;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        jh1 jh1Var = this.n;
        if (jh1Var != null) {
            jh1Var.a(this.G, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10 = this.x;
        if (i10 == 0) {
            int i11 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i12 = this.w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i11, new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.w), Integer.valueOf(i11)));
                return;
            }
        }
        if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.w == 0) {
                this.B.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.O > 0) {
                    this.B.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.B.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.k6 title = this.B.getTitle();
            int i13 = this.w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.O > 0) {
                this.B.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.B.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10;
        this.J = false;
        this.I = false;
        this.L.clear();
        this.K.b();
        this.M = null;
        if (this.x == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.b5 b5Var = new org.telegram.ui.Components.b5(parentActivity);
            b5Var.a = true;
            b5Var.b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, true, true, true);
            b5Var.c = k6Var;
            int i11 = org.telegram.ui.ActionBar.j6.A8;
            k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            k6Var.setTextSize(AndroidUtilities.dp(18.0f));
            k6Var.setGravity(3);
            k6Var.setTypeface(AndroidUtilities.bold());
            k6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            b5Var.addView(k6Var);
            org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(parentActivity, true, true, true);
            b5Var.d = k6Var2;
            k6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
            k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            k6Var2.setGravity(3);
            k6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            b5Var.addView(k6Var2);
            k6Var.getDrawable().D = true;
            k6Var2.getDrawable().D = true;
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
            k6Var.b(1.0f, 150L, mrVar);
            k6Var2.b(1.0f, 150L, mrVar);
            b5Var.setClipChildren(false);
            this.B = b5Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z4 = LocaleController.isRTL;
            kVar.addView(b5Var, k7.b6.d(-1, -1.0f, 0, z4 ? 0.0f : 64.0f, 0.0f, z4 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i12 = this.x;
        boolean z10 = this.F;
        if (i12 == 0 || i12 == 2) {
            if (z10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i12 == 1) {
            Y();
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 25));
        g gVar = new g(this, context, 4);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 6);
        this.a = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.a, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        gVar.addView(this.a);
        mh1 mh1Var = new mh1(this, context);
        this.b = mh1Var;
        this.a.addView(mh1Var, k7.b6.c(-2.0f, -1));
        final int i13 = 0;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hh1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.c);
                        break;
                    default:
                        this.b.X();
                        break;
                }
            }
        });
        kg.f fVar = new kg.f(this, context, 8);
        this.c = fVar;
        fVar.setTextSize(1, 16.0f);
        this.c.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xh, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.c.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yh, false));
        this.c.setCursorWidth(1.5f);
        kg.f fVar2 = this.c;
        fVar2.setInputType(fVar2.getInputType() | 176);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        this.c.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(4));
        this.c.setOnKeyListener(new t60(1, this));
        this.c.addTextChangedListener(new ih1(this));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.e = u00Var;
        u00Var.setViewType(10);
        org.telegram.ui.Components.u00 u00Var2 = this.e;
        u00Var2.w = false;
        u00Var2.setItemsCount(3);
        org.telegram.ui.Components.u00 u00Var3 = this.e;
        int i14 = org.telegram.ui.ActionBar.j6.G8;
        int i15 = org.telegram.ui.ActionBar.j6.i6;
        u00Var3.f(i14, i15, i15);
        gVar.addView(this.e);
        org.telegram.ui.Components.w60 w60Var = new org.telegram.ui.Components.w60(context, this.e, 1, null, 2);
        this.f = w60Var;
        w60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f.d.setText(LocaleController.getString(R.string.NoContacts));
        gVar.addView(this.f);
        f2.i0 i0Var = new f2.i0(1, false);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.d = rl0Var;
        rl0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.rl0 rl0Var2 = this.d;
        lh1 lh1Var = new lh1(this, context);
        this.h = lh1Var;
        rl0Var2.setAdapter(lh1Var);
        this.d.setLayoutManager(i0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.d.i(new nh.k(8));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new gg.v0(23, this, context));
        this.d.setOnScrollListener(new be1(this, 2));
        this.s = org.telegram.ui.Components.a20.b();
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.r = a20Var;
        a20Var.setImageResource(R.drawable.floating_check);
        gVar.addView(this.r, this.s);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hh1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.c);
                        break;
                    default:
                        this.b.X();
                        break;
                }
            }
        });
        this.r.setContentDescription(LocaleController.getString(R.string.Next));
        int i17 = z10 ? 5 : 3;
        for (int i18 = 1; i18 <= i17; i18++) {
            String str = "non_contacts";
            if (this.x == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i10 = 1;
                } else if (i18 == 2 && !this.E) {
                    str = "new_chats";
                    i10 = 2;
                } else if (i18 == (!this.E ? 1 : 0) + 2) {
                    str = "contacts";
                    i10 = 4;
                } else {
                    i10 = 8;
                }
            } else if (z10) {
                if (i18 == 1) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i18 == 2) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i18 == 3) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i18 == 4) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i18 == 1) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i18 == 2) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i10 & this.G) != 0) {
                org.telegram.ui.Components.o30 o30Var = new org.telegram.ui.Components.o30(this.c.getContext(), str);
                this.b.a(o30Var, false);
                o30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.H;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Long l10 = (Long) arrayList.get(i19);
                Object user = l10.longValue() > 0 ? getMessagesController().getUser(l10) : getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (user != null) {
                    org.telegram.ui.Components.o30 o30Var2 = new org.telegram.ui.Components.o30(this.c.getContext(), user);
                    this.b.a(o30Var2, false);
                    o30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.w60 w60Var = this.f;
            if (w60Var != null) {
                w60Var.e(false, true);
            }
            lh1 lh1Var = this.h;
            if (lh1Var != null) {
                lh1Var.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.d.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        jy0 jy0Var = new jy0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.t3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.S7));
        int i12 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) view;
        if (!o30Var.y) {
            org.telegram.ui.Components.o30 o30Var2 = this.M;
            if (o30Var2 != null) {
                o30Var2.a();
            }
            this.M = o30Var;
            o30Var.b();
            return;
        }
        this.M = null;
        this.b.b(o30Var);
        if (this.x == 2) {
            if (o30Var.getUid() == -9223372036854775800L) {
                this.G &= -2;
            } else if (o30Var.getUid() == -9223372036854775799L) {
                this.G &= -3;
            } else if (o30Var.getUid() == Long.MIN_VALUE) {
                this.G &= -5;
            } else if (o30Var.getUid() == -9223372036854775807L) {
                this.G &= -9;
            }
        } else if (o30Var.getUid() == Long.MIN_VALUE) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (o30Var.getUid() == -9223372036854775807L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (o30Var.getUid() == -9223372036854775806L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (o30Var.getUid() == -9223372036854775805L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (o30Var.getUid() == -9223372036854775804L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (o30Var.getUid() == -9223372036854775803L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (o30Var.getUid() == -9223372036854775802L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (o30Var.getUid() == -9223372036854775801L) {
            this.G &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        Y();
        W();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        kg.f fVar = this.c;
        if (fVar != null) {
            fVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.y = i10;
        mh1 mh1Var = this.b;
        if (mh1Var != null) {
            mh1Var.requestLayout();
        }
    }
}
