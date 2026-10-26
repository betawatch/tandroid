package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.oj;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public final void e(oj ojVar) {
        this.a = ojVar;
    }
}
