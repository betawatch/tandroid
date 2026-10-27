package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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

    public final boolean c(int i10, long j10) {
        if (this.b == i10 && this.c == j10) {
            return false;
        }
        this.b = i10;
        this.c = j10;
        if (i10 != 0) {
            return true;
        }
        this.e = false;
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(rj rjVar) {
        this.a = rjVar;
    }
}
