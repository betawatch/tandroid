package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gy extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ my a;

    public gy(my myVar) {
        this.a = myVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        my myVar = this.a;
        int i11 = myVar.w;
        ArrayList arrayList = myVar.e;
        int i12 = myVar.x;
        if (i9 == -1) {
            if (myVar.y != null) {
                myVar.finishFragment();
                return;
            }
            myVar.X();
        }
        if (i9 != 1 || myVar.getParentActivity() == null) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i13)).longValue(), 0L));
        }
        myVar.getMessagesStorage().putWidgetDialogs(i12, arrayList2);
        SharedPreferences.Editor edit = myVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
        i10 = ((org.telegram.ui.ActionBar.o2) myVar).currentAccount;
        edit.putInt("account" + i12, i10);
        edit.putInt(TeXSymbolParser.TYPE_ATTR + i12, i11);
        edit.commit();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(myVar.getParentActivity());
        if (i11 == 0) {
            ChatsWidgetProvider.updateWidget(myVar.getParentActivity(), appWidgetManager, i12);
        } else {
            ContactsWidgetProvider.updateWidget(myVar.getParentActivity(), appWidgetManager, i12);
        }
        b1 b1Var = myVar.y;
        if (b1Var == null) {
            myVar.X();
            return;
        }
        int i14 = b1Var.a;
        Object obj = b1Var.b;
        switch (i14) {
            case 25:
                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                int i15 = ChatsWidgetConfigActivity.B;
                Intent intent = new Intent();
                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.A);
                chatsWidgetConfigActivity.setResult(-1, intent);
                chatsWidgetConfigActivity.finish();
                break;
            default:
                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                int i16 = ContactsWidgetConfigActivity.B;
                Intent intent2 = new Intent();
                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.A);
                contactsWidgetConfigActivity.setResult(-1, intent2);
                contactsWidgetConfigActivity.finish();
                break;
        }
    }
}
