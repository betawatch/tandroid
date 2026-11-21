package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class v0 {
    public final SensorManager a;
    public Sensor b;
    public long c;
    public Sensor d;
    public long e;
    public Sensor f;
    public Sensor g;
    public long h;
    public Sensor i;
    public long j;
    public org.telegram.ui.web.s0 k;
    public boolean l;
    public kg.i0 m;
    public kg.i0 o;
    public kg.i0 q;
    public kg.i0 s;
    public final s0 n = new s0(this, 0);
    public final s0 p = new s0(this, 1);
    public final t0 r = new t0(this);
    public final u0 t = new u0(this);

    public v0(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j3) {
        if (j3 >= 160) {
            return 3;
        }
        return j3 >= 60 ? 2 : 1;
    }

    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.unregisterListener(this.n, sensor);
            }
            kg.i0 i0Var = this.m;
            if (i0Var != null) {
                org.telegram.messenger.g0.r(i0Var);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            kg.i0 i0Var2 = this.o;
            if (i0Var2 != null) {
                org.telegram.messenger.g0.r(i0Var2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            t0 t0Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(t0Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(t0Var, sensor4);
            }
            kg.i0 i0Var3 = this.q;
            if (i0Var3 != null) {
                org.telegram.messenger.g0.r(i0Var3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            kg.i0 i0Var4 = this.s;
            if (i0Var4 != null) {
                org.telegram.messenger.g0.r(i0Var4);
                this.s = null;
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.b == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.b = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.c = j3;
            if (!this.l) {
                sensorManager.registerListener(this.n, defaultSensor, a(j3));
            }
        }
        return true;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.d == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            this.d = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.e = j3;
            if (!this.l) {
                sensorManager.registerListener(this.p, defaultSensor, a(j3));
            }
        }
        return true;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        u0 u0Var = this.t;
        t0 t0Var = this.r;
        if (z10) {
            if (this.i != null) {
                kg.i0 i0Var = this.s;
                if (i0Var != null) {
                    org.telegram.messenger.g0.r(i0Var);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(u0Var, sensor);
                }
                this.i = null;
            }
            if (this.f == null || this.g == null) {
                this.g = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                this.f = defaultSensor;
                Sensor sensor2 = this.g;
                if (sensor2 == null || defaultSensor == null) {
                    return false;
                }
                this.h = j3;
                if (!this.l) {
                    sensorManager.registerListener(t0Var, sensor2, a(j3));
                    sensorManager.registerListener(t0Var, this.f, a(j3));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                kg.i0 i0Var2 = this.q;
                if (i0Var2 != null) {
                    org.telegram.messenger.g0.r(i0Var2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(t0Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(t0Var, sensor4);
                    }
                }
                this.g = null;
                this.f = null;
            }
            if (this.i == null) {
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                this.i = defaultSensor2;
                if (defaultSensor2 == null) {
                    return false;
                }
                this.j = j3;
                if (!this.l) {
                    sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                }
            }
        }
        return true;
    }

    public final boolean f() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.n, sensor);
        }
        kg.i0 i0Var = this.m;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.m = null;
        }
        this.b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.p, sensor);
        }
        kg.i0 i0Var = this.o;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.g;
        if (sensor == null && this.f == null && this.i == null) {
            return true;
        }
        if (!this.l) {
            t0 t0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        kg.i0 i0Var = this.q;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.q = null;
        }
        kg.i0 i0Var2 = this.s;
        if (i0Var2 != null) {
            org.telegram.messenger.g0.r(i0Var2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
