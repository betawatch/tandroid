package l8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder a;
    public boolean b = false;
    public ArrayList c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.a = dataHolder;
        this.d = new Status(dataHolder.e, null, null, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kotlin.jvm.internal.a(this);
    }

    public final int n(int i10) {
        if (i10 < 0 || i10 >= this.c.size()) {
            throw new IllegalArgumentException(l.d.k(i10, "Position ", " is out of bounds for this buffer"));
        }
        return ((Integer) this.c.get(i10)).intValue();
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.b) {
                    DataHolder dataHolder = this.a;
                    b6.m.h(dataHolder);
                    int i10 = dataHolder.n;
                    ArrayList arrayList = new ArrayList();
                    this.c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int e6 = this.a.e(0);
                        DataHolder dataHolder2 = this.a;
                        dataHolder2.f(0, "path");
                        String string = dataHolder2.d[e6].getString(0, dataHolder2.c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int e10 = this.a.e(i11);
                            DataHolder dataHolder3 = this.a;
                            dataHolder3.f(i11, "path");
                            String string2 = dataHolder3.d[e10].getString(i11, dataHolder3.c.getInt("path"));
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + e10);
                            }
                            if (!string2.equals(string)) {
                                this.c.add(Integer.valueOf(i11));
                                string = string2;
                            }
                        }
                    }
                    this.b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
