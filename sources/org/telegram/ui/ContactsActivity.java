package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.o2 implements ne.d, NotificationCenter.NotificationCenterDelegate, qg0, qh.d {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public long S;
    public long T;
    public String U;
    public boolean V;
    public ts W;
    public String X;
    public ei.g6 Y;
    public org.telegram.ui.Components.k20 Z;
    public final int a;
    public org.telegram.ui.ActionBar.c2 a0;
    public final ne.b b;
    public boolean b0;
    public final ne.b c;
    public boolean c0;
    public qs d;
    public final a0.h d0;
    public org.telegram.ui.Components.wx0 e;
    public ImageView e0;
    public org.telegram.ui.Components.mm0 f;
    public NumberTextView f0;
    public org.telegram.ui.ActionBar.u0 g0;
    public org.telegram.ui.Components.pl0 h;
    public org.telegram.ui.ActionBar.h2 h0;
    public String i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public final z5 m0;
    public s4.b0 n;
    public int n0;
    public int o0;
    public float p0;
    public int phonebookRow;
    public int q0;
    public ps r;
    public int r0;
    public org.telegram.ui.ActionBar.u0 s;
    public boolean s0;
    public final bh.f t0;
    public final gh.d u0;
    public boolean v;
    public final gh.d v0;
    public org.telegram.ui.Components.h20 w;
    public bh.l w0;
    public boolean x;
    public final ArrayList x0;
    public y8 y;
    public final RectF y0;
    public final RectF z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.b = new ne.b(0, this, bsVar, 350L, false);
        this.c = new ne.b(2, this, bsVar, 350L, false);
        this.phonebookRow = 0;
        this.x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.b0 = true;
        this.d0 = new a0.h();
        this.j0 = true;
        this.m0 = new z5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.x0 = arrayList;
        RectF rectF = new RectF();
        this.y0 = rectF;
        RectF rectF2 = new RectF();
        this.z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i10 >= 31) {
            this.t0 = new bh.f(false);
            this.u0 = new gh.d(null);
            this.v0 = new gh.d(null);
        } else {
            this.t0 = null;
            this.u0 = null;
            this.v0 = null;
        }
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        a0.h hVar = contactsActivity.d0;
        s4.g0 adapter = contactsActivity.f.getAdapter();
        ps psVar = contactsActivity.r;
        if (adapter == psVar) {
            psVar.getClass();
            Object E = contactsActivity.r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.i6)) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                if (i6Var.getUser() == null || !i6Var.getUser().contact) {
                    return;
                }
                contactsActivity.r0(i6Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof ContactsController.Contact) {
                        ContactsController.Contact contact = (ContactsController.Contact) E;
                        org.telegram.ui.Components.f5.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                        return;
                    }
                    return;
                }
                String str = (String) E;
                if (str.equals("section")) {
                    return;
                }
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                rj0 rj0Var = new rj0(contactsActivity.getParentActivity(), contactsActivity);
                rj0Var.x(str, true);
                rj0Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            ps psVar2 = contactsActivity.r;
            int size = psVar2.d.size();
            int size2 = psVar2.H.size();
            hg.a2 a2Var = psVar2.f;
            int size3 = a2Var.e.size();
            int size4 = a2Var.j.size();
            if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                contactsActivity.getMessagesController().putUsers(arrayList, false);
                MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
            }
            if (contactsActivity.K) {
                contactsActivity.n0(user, true, null);
                return;
            }
            if (contactsActivity.L) {
                if (user.id == UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                    return;
                }
                contactsActivity.M = true;
                SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                contactsActivity.presentFragment(new sn(bundle), contactsActivity.Q);
                return;
            }
            return;
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q < 0 || S < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.br)) {
            org.telegram.ui.Components.h20 h20Var = contactsActivity.w;
            if (h20Var != null) {
                h20Var.performClick();
                return;
            }
            return;
        }
        if (!hVar.i() && (view instanceof org.telegram.ui.Cells.wa)) {
            contactsActivity.r0((org.telegram.ui.Cells.wa) view);
            return;
        }
        if ((contactsActivity.G && i10 == 0) || S != 0) {
            Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (contactsActivity.K) {
                    contactsActivity.n0(user2, true, null);
                    return;
                }
                if (contactsActivity.L) {
                    contactsActivity.M = true;
                    SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                    contactsActivity.presentFragment(new sn(bundle2), contactsActivity.Q);
                    return;
                }
                return;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact2 = (ContactsController.Contact) O;
                String str2 = !contact2.phones.isEmpty() ? contact2.phones.get(0) : null;
                if (str2 == null || contactsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.InviteUser);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.p2(str2, 29, contactsActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                contactsActivity.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (contactsActivity.H) {
            if (Q != 0) {
                if (Q == 1) {
                    contactsActivity.presentFragment(new m9(null));
                    return;
                }
                return;
            } else if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new x70());
                return;
            }
        }
        if (i10 != 0) {
            if (Q == 0) {
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                long j10 = contactsActivity.T;
                if (j10 == 0) {
                    j10 = contactsActivity.S;
                }
                y60 y60Var = new y60(null);
                y60Var.d = j10;
                contactsActivity.presentFragment(y60Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new p60(new Bundle()), false);
                return;
            }
        }
        if (Q == 1) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                contactsActivity.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")));
            } else {
                contactsActivity.presentFragment(new g(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            }
        }
    }

    public static /* synthetic */ void V(ContactsActivity contactsActivity, int i10) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        contactsActivity.b0 = i10 != 0;
        if (i10 == 0) {
            return;
        }
        contactsActivity.e0(false);
    }

    public static /* synthetic */ void W(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void X(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new rj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity) {
        float y3 = contactsActivity.f.getY() + contactsActivity.f.getPaddingTop();
        int i10 = 0;
        while (true) {
            if (i10 >= contactsActivity.f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f.getChildAt(i10);
            contactsActivity.f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.m0 X = contactsActivity.f.X(i10);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.mm0 mm0Var = contactsActivity.f;
                X.a(rect, childAt, mm0Var, mm0Var.u0);
                y3 = contactsActivity.f.getY() + (childAt.getY() - (contactsActivity.d.K ? 0 : rect.top));
            } else {
                if (R > 0) {
                    y3 = -AndroidUtilities.dp(52.0f);
                    break;
                }
                i10++;
            }
        }
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f.getY() + contactsActivity.f.getPaddingTop(), contactsActivity.c.e) - AndroidUtilities.dp(48.0f));
        contactsActivity.b.a(y3 > (contactsActivity.f.getY() + ((float) contactsActivity.f.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public static void d0(ContactsActivity contactsActivity) {
        qs qsVar;
        org.telegram.ui.Components.h20 h20Var = contactsActivity.w;
        if (h20Var == null || (qsVar = contactsActivity.d) == null) {
            return;
        }
        h20Var.e((!contactsActivity.x || contactsActivity.F || qsVar.I) ? false : true, true);
    }

    @Override // qh.d
    public final View N() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.qg0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.mm0 mm0Var = this.f;
        return mm0Var == null || mm0Var.getFastScroll() == null || !this.f.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.K();
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        createActionBar.j();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10;
        final int i11 = 0;
        this.F = false;
        this.E = false;
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (!this.J) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        } else if (this.K) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(this.L ? R.string.NewSecretChat : R.string.NewMessageTitle));
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.h0 = h2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(h2Var);
        }
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20(context, this.resourceProvider);
        this.Z = k20Var;
        k20Var.w = true;
        k20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        k20Var.updateColors();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.y i13 = this.actionBar.i(null);
        i13.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.e0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            org.telegram.ui.ActionBar.r6.t(this.e0, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.e0;
            int i14 = org.telegram.ui.ActionBar.k6.z8;
            org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i14), getResourceProvider());
            this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ms
                public final /* synthetic */ ContactsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.o0();
                            break;
                        default:
                            ContactsActivity.X(this.b);
                            break;
                    }
                }
            });
            i13.addView(this.e0, w7.z5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(i13.getContext());
        this.f0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f0.setTypeface(AndroidUtilities.bold());
        this.f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
        i13.addView(this.f0, w7.z5.m(1.0f, 0, -1, this.I ? 18 : 72, 0, 0));
        int i15 = 2;
        this.f0.setOnTouchListener(new di.d(i15));
        i13.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new os(this));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        this.g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ei.e2 e2Var = this.Z.r;
        e2Var.addTextChangedListener(new zf.h0(e2Var, new ig.b2(this, 7)));
        if (!this.L && !this.K) {
            org.telegram.ui.ActionBar.u0 a10 = m10.a(1, this.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f = new org.telegram.ui.Components.mm0(context, null);
        this.r = new ps(this, context, this.d0, this.V, this.O, this.N);
        int i16 = 3;
        if (this.T != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.T)), 3) ? 1 : 0;
        } else {
            if (this.S != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        qs qsVar = new qs(this, context, this.G ? 1 : 0, this.H, this.d0, i10);
        this.d = qsVar;
        if (this.s == null) {
            i15 = 0;
        } else if (this.v) {
            i15 = 1;
        }
        qsVar.Y(i15, false);
        this.d.H = this.c0;
        y8 y8Var = new y8(this, context, i16);
        this.y = y8Var;
        this.fragmentView = y8Var;
        org.telegram.ui.Components.mm0 mm0Var = this.f;
        Objects.requireNonNull(mm0Var);
        this.w0 = new bh.l(mm0Var, y8Var, new ns(mm0Var, i11));
        this.f.C0(new js(this, i12));
        this.f.setSections(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, this.y, getResourceProvider());
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(29);
        b10Var.w = false;
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, b10Var, 1, null);
        this.e = wx0Var;
        wx0Var.addView(b10Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.y.addView(this.e, w7.z5.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.m = false;
        this.f.setItemAnimator(kVar);
        this.f.setSectionsType(1);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setFastScrollEnabled(0);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f;
        s4.b0 b0Var = new s4.b0(1, false);
        this.n = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        this.f.setAdapter(this.d);
        this.f.setClipToPadding(false);
        org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(this.f, this.n);
        this.h = pl0Var;
        pl0Var.h = new ls(this);
        y8 y8Var2 = this.y;
        org.telegram.ui.Components.mm0 mm0Var3 = this.f;
        float f7 = -this.a;
        y8Var2.addView(mm0Var3, w7.z5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.y.addView(this.Z, w7.z5.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f.setEmptyView(this.e);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f;
        mm0Var4.W1 = true;
        mm0Var4.X1 = 0;
        mm0Var4.setOnItemClickListener(new i2.r(this, i10, 10));
        this.f.setOnItemLongClickListener(new ls(this));
        this.f.setOnScrollListener(new rs(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
            this.w = h20Var;
            this.y.addView(h20Var, org.telegram.ui.Components.h20.b());
            this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ms
                public final /* synthetic */ ContactsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.b.o0();
                            break;
                        default:
                            ContactsActivity.X(this.b);
                            break;
                    }
                }
            });
            this.w.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.w.c.getAnimatedDrawable().M(this.w.c.getAnimatedDrawable().e[0] - 1);
            this.w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.X;
        if (str != null) {
            this.actionBar.x(str);
            this.X = null;
        }
        this.y.addView(this.actionBar);
        ei.g6 g6Var = new ei.g6(context, this.parentLayout);
        this.Y = g6Var;
        g6Var.b(false, false);
        this.y.addView(this.Y, w7.z5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f);
        this.actionBar.setDrawBlurBackground(this.y);
        this.b.a(true, false);
        l0();
        setBulletinDelegate(new b9(this, i16));
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity != null) {
            launchActivity.i1.d.add(this);
        }
        View view = this.fragmentView;
        ls lsVar = new ls(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, lsVar);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.mm0 mm0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            qs qsVar = this.d;
            if (qsVar != null) {
                if (!this.v) {
                    qsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.r != null) {
                s4.g0 adapter = this.f.getAdapter();
                ps psVar = this.r;
                if (adapter == psVar) {
                    psVar.G(this.i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 != NotificationCenter.encryptedChatCreated) {
                if (i10 != NotificationCenter.closeChats || this.M) {
                    return;
                }
                removeSelfFromStack(true);
                return;
            }
            if (this.L && this.M) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new sn(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (mm0Var = this.f) != null) {
            int childCount = mm0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.wa) {
                    ((org.telegram.ui.Cells.wa) childAt).i(intValue);
                }
            }
        }
        if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.v || this.d == null || this.l0) {
            return;
        }
        this.l0 = true;
        z5 z5Var = this.m0;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        AndroidUtilities.runOnUIThread(z5Var, 5000L);
    }

    public final void e0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z10 && this.b0) {
            showDialog(org.telegram.ui.Components.f5.w(parentActivity, new is(this, 1)).a);
            return;
        }
        this.k0 = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void f0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.t0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.q0) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.z0;
        rectF.set(0.0f, dp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.I ? 2 : 1, this.x0);
        fVar.e(this.w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void g0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.updateColors();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(6, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
        org.telegram.ui.Components.h20 h20Var = this.w;
        if (h20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(h20Var.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.w.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.wx0 wx0Var = this.e;
        if (wx0Var != null) {
            wx0Var.b(Math.max(this.q0 + this.n0, this.r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.h20 h20Var = this.w;
        if (h20Var != null) {
            h20Var.setTranslationY(((-this.q0) - this.o0) - this.p0);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.f.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r1 + 44), 0, AndroidUtilities.dp(this.a) + this.q0 + this.n0);
    }

    @Override // qh.d
    public final void k(r0.k1 k1Var) {
        this.r0 = k1Var.a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.h20.d(this.g0, (1.0f - this.c.e) * (1.0f - this.b.e));
    }

    public final void l0() {
        qs qsVar = this.d;
        boolean z10 = qsVar != null && qsVar.I;
        if (this.s0 != z10 || TextUtils.isEmpty(this.Z.r.getHint())) {
            this.Z.r.setHint(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.Z.r.setContentDescription(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.s0 = z10;
        }
    }

    public final void m0() {
        float f7 = 1.0f - this.c.e;
        qs qsVar = this.d;
        org.telegram.ui.Components.h20.d(this.s, f7 * ((qsVar == null || qsVar.I) ? 0.0f : 1.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z10 || this.U == null) {
            ts tsVar = this.W;
            if (tsVar != null) {
                tsVar.b(user);
                if (this.R) {
                    this.W = null;
                }
            }
            if (this.Q) {
                finishFragment();
                return;
            }
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (user.bot) {
            if (user.bot_nochats) {
                try {
                    org.telegram.ui.Components.xc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (this.S != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                if (canAddAdmins) {
                    c2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                    c2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new ks(this, user, str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    c2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                }
                showDialog(c2Var);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
        c2Var2.R = string;
        String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
        if (user.bot || !this.P) {
            editTextBoldCursor = null;
        } else {
            formatStringSimple = a1.g.D(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.T(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new ss(editTextBoldCursor));
            alertDialog$Builder2.o(editTextBoldCursor);
        }
        c2Var2.T = formatStringSimple;
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new e7(this, user, editTextBoldCursor, 11));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var2);
        if (editTextBoldCursor != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
            if (marginLayoutParams != null) {
                if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                }
                int dp = AndroidUtilities.dp(24.0f);
                marginLayoutParams.leftMargin = dp;
                marginLayoutParams.rightMargin = dp;
                marginLayoutParams.height = AndroidUtilities.dp(36.0f);
                editTextBoldCursor.setLayoutParams(marginLayoutParams);
            }
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        }
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.d0;
            if (i10 >= childCount) {
                hVar.b();
                this.h0.c(0.0f, true);
                return;
            }
            View childAt = this.f.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.wa) {
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) childAt;
                if (hVar.h(waVar.getDialogId()) >= 0) {
                    waVar.c(false, true);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                if (hVar.h(i6Var.getDialogId()) >= 0) {
                    i6Var.s(false, true);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                o0();
                return false;
            }
        } else {
            if (!this.c.f) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.Z.r.getText().clear();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.j0 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.j0 = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                e0(true);
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.f5.w(parentActivity, new is(this, 0)).a;
            this.a0 = c2Var;
            showDialog(c2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.c2 c2Var = this.a0;
        if (c2Var == null || dialog != c2Var || getParentActivity() == null || !this.b0) {
            return;
        }
        e0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.G = bundle.getBoolean("onlyUsers", false);
            this.J = this.arguments.getBoolean("destroyAfterSelect", false);
            this.K = this.arguments.getBoolean("returnAsResult", false);
            this.L = this.arguments.getBoolean("createSecretChat", false);
            this.U = this.arguments.getString("selectAlertString");
            this.V = this.arguments.getBoolean("allowUsernameSearch", true);
            this.P = this.arguments.getBoolean("needForwardCount", true);
            this.O = this.arguments.getBoolean("allowBots", true);
            this.N = this.arguments.getBoolean("allowSelf", true);
            this.S = this.arguments.getLong("channelId", 0L);
            this.Q = this.arguments.getBoolean("needFinishFragment", true);
            this.T = this.arguments.getLong("chat_id", 0L);
            this.c0 = this.arguments.getBoolean("disableSections", false);
            this.R = this.arguments.getBoolean("resetDelegate", false);
            this.H = this.arguments.getBoolean("needPhonebook", false);
            this.I = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.H = true;
        }
        if (!this.L && !this.K) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        this.n0 = this.I ? AndroidUtilities.dp(72.0f) : 0;
        this.o0 = this.I ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.W = null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.q0 = i13;
        j0();
        i0();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.g(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.k0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        qs qsVar = this.d;
        if (qsVar != null) {
            qsVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
            try {
                org.telegram.ui.Components.mm0 mm0Var = this.f;
                if (mm0Var != null) {
                    mm0Var.A1();
                }
                NumberTextView numberTextView = this.f0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(ai.e4 e4Var) {
        this.W = e4Var;
    }

    public final void q0(String str) {
        this.X = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.wa;
        boolean z12 = false;
        a0.h hVar = this.d0;
        if (z11) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) viewGroup;
            long dialogId = waVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                waVar.c(false, true);
            } else if (waVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) waVar.getCurrentObject(), dialogId);
                waVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            if (!(viewGroup instanceof org.telegram.ui.Cells.i6)) {
                return;
            }
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) viewGroup;
            long dialogId2 = i6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                i6Var.s(false, true);
            } else if (i6Var.getUser() != null) {
                hVar.k(i6Var.getUser(), dialogId2);
                i6Var.s(true, true);
                z10 = true;
            }
            z10 = false;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.N(null, null);
            this.h0.c(1.0f, true);
        }
        this.f0.a(hVar.m(), z12);
    }

    @Override // org.telegram.ui.qg0
    public final void t() {
        if (this.n.L0() < 15) {
            this.f.x0(0);
        } else {
            org.telegram.ui.Components.pl0 pl0Var = this.h;
            pl0Var.b = 1;
            pl0Var.c(0, 0, false, false);
        }
        this.b.a(true, true);
    }

    @Override // org.telegram.ui.qg0
    public final gh.d z() {
        return this.v0;
    }

    @Override // qh.d
    public final /* synthetic */ void L() {
    }

    @Override // qh.d
    public final /* synthetic */ void u() {
    }

    @Override // ne.d
    public final void H(float f7, int i10) {
    }
}
