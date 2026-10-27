package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hy extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ny a;

    public hy(ny nyVar) {
        this.a = nyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        ny nyVar = this.a;
        int i12 = nyVar.w;
        ArrayList arrayList = nyVar.e;
        int i13 = nyVar.x;
        if (i10 == -1) {
            if (nyVar.y != null) {
                nyVar.finishFragment();
                return;
            }
            nyVar.Z();
        }
        if (i10 != 1 || nyVar.getParentActivity() == null) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
        }
        nyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
        SharedPreferences.Editor edit = nyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
        i11 = ((org.telegram.ui.ActionBar.r2) nyVar).currentAccount;
        edit.putInt("account" + i13, i11);
        edit.putInt(TeXSymbolParser.TYPE_ATTR + i13, i12);
        edit.commit();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(nyVar.getParentActivity());
        if (i12 == 0) {
            ChatsWidgetProvider.updateWidget(nyVar.getParentActivity(), appWidgetManager, i13);
        } else {
            ContactsWidgetProvider.updateWidget(nyVar.getParentActivity(), appWidgetManager, i13);
        }
        y0 y0Var = nyVar.y;
        if (y0Var == null) {
            nyVar.Z();
            return;
        }
        int i15 = y0Var.a;
        Object obj = y0Var.b;
        switch (i15) {
            case 27:
                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                int i16 = ChatsWidgetConfigActivity.F;
                Intent intent = new Intent();
                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                chatsWidgetConfigActivity.setResult(-1, intent);
                chatsWidgetConfigActivity.finish();
                break;
            default:
                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                int i17 = ContactsWidgetConfigActivity.F;
                Intent intent2 = new Intent();
                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                contactsWidgetConfigActivity.setResult(-1, intent2);
                contactsWidgetConfigActivity.finish();
                break;
        }
    }
}
