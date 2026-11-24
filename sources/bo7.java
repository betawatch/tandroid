// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class bo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo7 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ bo7(lo7 lo7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = lo7Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lo7 lo7Var = this.b;
                lo7Var.x = this.c;
                Intent intent = new Intent(a.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", lo7Var.currentAccount);
                intent.setFlags(268763140);
                a.b.startActivity(intent);
                a.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                lo7 lo7Var2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    lo7Var2.w.remove(arrayList.get(i));
                }
                nm7.e().k(nm7.h4, new Object[0]);
                break;
            case 2:
                lo7 lo7Var3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lo7Var3.w.remove(arrayList2.get(i2));
                }
                nm7.e().k(nm7.h4, new Object[0]);
                break;
            case 3:
                lo7 lo7Var4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    lo7Var4.w.remove(arrayList3.get(i3));
                }
                nm7.e().k(nm7.h4, new Object[0]);
                break;
            default:
                lo7 lo7Var5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    lo7Var5.w.remove(arrayList4.get(i4));
                }
                nm7.e().k(nm7.h4, new Object[0]);
                break;
        }
    }
}
