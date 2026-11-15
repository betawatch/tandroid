package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class w0 {
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
    public kg.j1 m;
    public kg.j1 o;
    public kg.j1 q;
    public kg.j1 s;
    public final t0 n = new t0(this, 0);
    public final t0 p = new t0(this, 1);
    public final u0 r = new u0(this);
    public final v0 t = new v0(this);

    public w0(Context context) {
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
            kg.j1 j1Var = this.m;
            if (j1Var != null) {
                org.telegram.messenger.g0.r(j1Var);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            kg.j1 j1Var2 = this.o;
            if (j1Var2 != null) {
                org.telegram.messenger.g0.r(j1Var2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            u0 u0Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(u0Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(u0Var, sensor4);
            }
            kg.j1 j1Var3 = this.q;
            if (j1Var3 != null) {
                org.telegram.messenger.g0.r(j1Var3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            kg.j1 j1Var4 = this.s;
            if (j1Var4 != null) {
                org.telegram.messenger.g0.r(j1Var4);
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
        v0 v0Var = this.t;
        u0 u0Var = this.r;
        if (z10) {
            if (this.i != null) {
                kg.j1 j1Var = this.s;
                if (j1Var != null) {
                    org.telegram.messenger.g0.r(j1Var);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(v0Var, sensor);
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
                    sensorManager.registerListener(u0Var, sensor2, a(j3));
                    sensorManager.registerListener(u0Var, this.f, a(j3));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                kg.j1 j1Var2 = this.q;
                if (j1Var2 != null) {
                    org.telegram.messenger.g0.r(j1Var2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(u0Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(u0Var, sensor4);
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
                    sensorManager.registerListener(v0Var, defaultSensor2, a(j3));
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
        kg.j1 j1Var = this.m;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
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
        kg.j1 j1Var = this.o;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
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
            u0 u0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(u0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(u0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        kg.j1 j1Var = this.q;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            this.q = null;
        }
        kg.j1 j1Var2 = this.s;
        if (j1Var2 != null) {
            org.telegram.messenger.g0.r(j1Var2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
