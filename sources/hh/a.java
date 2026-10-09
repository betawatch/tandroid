package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.wj;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        if (messageObject.getId() != this.b) {
            return this.c != 0 && messageObject.getGroupId() == this.c;
        }
        return true;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i10, long j3) {
        if (this.b == i10 && this.c == j3) {
            return false;
        }
        this.b = i10;
        this.c = j3;
        if (i10 != 0) {
            return true;
        }
        this.e = false;
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(wj wjVar) {
        this.a = wjVar;
    }
}
