package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class da extends org.telegram.ui.ActionBar.r2 {
    public ca a;
    public ca b;
    public org.telegram.ui.ActionBar.w0 c;
    public org.telegram.ui.ActionBar.u6 d;

    public static void V(da daVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(daVar.currentAccount).getCurrentUser();
        if (currentUser == null || daVar.b.getText() == null || daVar.a.getText() == null) {
            return;
        }
        String obj = daVar.a.getText().toString();
        String obj2 = daVar.b.getText().toString();
        String str2 = currentUser.first_name;
        if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            currentUser.first_name = obj;
            updateprofile.last_name = obj2;
            currentUser.last_name = obj2;
            TLRPC.User user = MessagesController.getInstance(daVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(daVar.currentAccount).getClientUserId()));
            if (user != null) {
                user.first_name = updateprofile.first_name;
                user.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(daVar.currentAccount).saveConfig(true);
            NotificationCenter.getInstance(daVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(daVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(daVar.currentAccount).sendRequest(updateprofile, new di.d6(8));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f8, u6Var);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.v8, u6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 29));
        this.c = this.actionBar.l().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.d(2));
        ca caVar = new ca(this, context, 0);
        this.a = caVar;
        caVar.setTextSize(1, 18.0f);
        ca caVar2 = this.a;
        int i10 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(caVar2, i10, u6Var);
        ca caVar3 = this.a;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(caVar3, i11, u6Var);
        this.a.setBackgroundDrawable(null);
        ca caVar4 = this.a;
        int i12 = org.telegram.ui.ActionBar.y6.k6;
        int i13 = org.telegram.ui.ActionBar.y6.l6;
        int i14 = org.telegram.ui.ActionBar.y6.p7;
        org.telegram.ui.ActionBar.f7.G(caVar4, i12, i13, i14, u6Var);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(LocaleController.isRTL ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(LocaleController.getString(R.string.FirstName));
        org.telegram.ui.ActionBar.f7.w(this.a, i11, u6Var);
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, org.telegram.ui.Components.gb1.o(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        final int i15 = 0;
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ba
            public final /* synthetic */ da b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i16 == 5) {
                            da daVar = this.b;
                            daVar.b.requestFocus();
                            ca caVar5 = daVar.b;
                            caVar5.setSelection(caVar5.length());
                            break;
                        }
                        break;
                    default:
                        if (i16 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        ca caVar5 = new ca(this, context, 1);
        this.b = caVar5;
        caVar5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.b, i10, u6Var);
        org.telegram.ui.ActionBar.f7.V(this.b, i11, u6Var);
        this.b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.f7.G(this.b, i12, i13, i14, u6Var);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(LocaleController.isRTL ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.LastName));
        org.telegram.ui.ActionBar.f7.w(this.b, i11, u6Var);
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, org.telegram.ui.Components.gb1.o(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        final int i16 = 1;
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ba
            public final /* synthetic */ da b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i162, KeyEvent keyEvent) {
                switch (i16) {
                    case 0:
                        if (i162 == 5) {
                            da daVar = this.b;
                            daVar.b.requestFocus();
                            ca caVar52 = daVar.b;
                            caVar52.setSelection(caVar52.length());
                            break;
                        }
                        break;
                    default:
                        if (i162 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (user != null) {
            this.a.setText(user.first_name);
            ca caVar6 = this.a;
            caVar6.setSelection(caVar6.length());
            this.b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ca caVar = this.a;
        int i10 = org.telegram.ui.ActionBar.y6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(caVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        ca caVar2 = this.a;
        int i11 = org.telegram.ui.ActionBar.y6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(caVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new zt0(this, 18), 100L);
        }
    }
}
